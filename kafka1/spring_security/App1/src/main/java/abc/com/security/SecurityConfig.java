package abc.com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authorization.AuthorityAuthorizationManager;
import org.springframework.security.config.annotation
             .authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web
             .builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Autowired
  private UserDetailsService userDetailsService;
  //.antMatchers("/design", "/orders").access("hasRole('USER')")
  //.antMatchers("/", "/**").access("permitAll")

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
    return http
    .csrf()
    .disable()
    .authorizeHttpRequests()
    .requestMatchers("/api/v1/auth/**")
    .permitAll()
    .anyRequest()
    .authenticated()
    .and()
    .sessionManagement()
    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    .and()
    .authenticationProvider(authenticationProvider)
    .addFilterBefore(jwtAuthFiler, UsernamePasswordAuthenticationFilter.class)
    .build();
  
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .authorizeRequests()
        .antMatchers("/design", "/orders").access("hasRole('USER')")
        .antMatchers("/", "/**").access("permitAll")

      .and()
        .formLogin()
          .loginPage("/login")

      .and()
        .logout()
          .logoutSuccessUrl("/")

      // Make H2-Console non-secured; for debug purposes
      .and()
        .csrf()
          .ignoringAntMatchers("/h2-console/**")

      // Allow pages to be loaded in frames from the same origin; needed for H2-Console
      .and()
        .headers()
          .frameOptions()
            .sameOrigin()
      ;
  }

  /*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .userDetailsService(userDetailsService);

  }
   */

  @Bean
  public PasswordEncoder encoder() {
    return new BCryptPasswordEncoder();
  }


  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .userDetailsService(userDetailsService)
      .passwordEncoder(encoder());

  }

//
// IN MEMORY AUTHENTICATION EXAMPLE
//
/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .inMemoryAuthentication()
        .withUser("buzz")
          .password("infinity")
          .authorities("ROLE_USER")
        .and()
        .withUser("woody")
          .password("bullseye")
          .authorities("ROLE_USER");

  }
*/

//
// JDBC Authentication example
//
/*
  @Autowired
  DataSource dataSource;

  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .jdbcAuthentication()
        .dataSource(dataSource);

  }
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .jdbcAuthentication()
        .dataSource(dataSource)
        .usersByUsernameQuery(
            "select username, password, enabled from Users " +
            "where username=?")
        .authoritiesByUsernameQuery(
            "select username, authority from UserAuthorities " +
            "where username=?");

  }
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

    auth
      .jdbcAuthentication()
        .dataSource(dataSource)
        .usersByUsernameQuery(
            "select username, password, enabled from Users " +
            "where username=?")
        .authoritiesByUsernameQuery(
            "select username, authority from UserAuthorities " +
            "where username=?")
        .passwordEncoder(new BCryptPasswordEncoder());

  }
*/


//
// LDAP Authentication example
//
/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchFilter("(uid={0})")
        .groupSearchFilter("member={0}");
  }
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchBase("ou=people")
        .userSearchFilter("(uid={0})")
        .groupSearchBase("ou=groups")
        .groupSearchFilter("member={0}");
  }
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchBase("ou=people")
        .userSearchFilter("(uid={0})")
        .groupSearchBase("ou=groups")
        .groupSearchFilter("member={0}")
        .passwordCompare();
  }
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchBase("ou=people")
        .userSearchFilter("(uid={0})")
        .groupSearchBase("ou=groups")
        .groupSearchFilter("member={0}")
        .passwordCompare()
        .passwordEncoder(new BCryptPasswordEncoder())
        .passwordAttribute("passcode");
  }
*/

/*
@Override
protected void configure(AuthenticationManagerBuilder auth)
    throws Exception {
  auth
    .ldapAuthentication()
      .userSearchBase("ou=people")
      .userSearchFilter("(uid={0})")
      .groupSearchBase("ou=groups")
      .groupSearchFilter("member={0}")
      .passwordCompare()
      .passwordEncoder(new BCryptPasswordEncoder())
      .passwordAttribute("passcode")
      .and()
      .contextSource()
        .url("ldap://tacocloud.com:389/dc=tacocloud,dc=com");
}
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchBase("ou=people")
        .userSearchFilter("(uid={0})")
        .groupSearchBase("ou=groups")
        .groupSearchFilter("member={0}")
        .passwordCompare()
        .passwordEncoder(new BCryptPasswordEncoder())
        .passwordAttribute("passcode")
        .and()
        .contextSource()
          .root("dc=tacocloud,dc=com");
  }
*/

/*
  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth
      .ldapAuthentication()
        .userSearchBase("ou=people")
        .userSearchFilter("(uid={0})")
        .groupSearchBase("ou=groups")
        .groupSearchFilter("member={0}")
        .passwordCompare()
        .passwordEncoder(new BCryptPasswordEncoder())
        .passwordAttribute("passcode")
        .and()
        .contextSource()
          .root("dc=tacocloud,dc=com")
          .ldif("classpath:users.ldif");
  }
*/

}


/* 
To do a quick comparison, consider the following filter chain definition:

@Bean 
SecurityFilterChain web(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests((authorize) -> authorize
            .antMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
            .antMatchers("/resource/**").hasAuthorize("SCOPE_resource")
        )
        // ...

    return http.build();
}
The alternative is to publish an AuthorizationManager bean:

@Bean 
AuthorizationManager authz() {
    return RequestMatcherDelegatingAuthorizationManager.builder()
        .add(new AntPathRequestMatcher("/admin/**"), AuthorityAuthorizationManager.hasAuthority("ROLE_ADMIN"))
        .add(new AntPathRequestMatcher("/resource/**"), AuthorityAuthorizationManager.hasAuthority("SCOPE_resource"))
        .build();
}

@Bean 
SecurityFilterChain web(HttpSecurity http, AuthorizationManager authz) throws Exception {
    http
        .authorizeHttpRequests((authorize) -> authorize.anyRequest().access(authz))
        // ...

    return http.build();
}
Then, in places where you want to programmatically execute the same authorization decision logic, you can invoke the AuthorizationManager yourself. With the exception of some static prefixes, the two blocks of code are quite similar.

Would an approach like this achieve what you are trying to do?

My first question is if my suggestion fits the architecture

The reason that the above is preferred over publishing a @Bean is that it better encapsulates the DSL. This is similar to Security's preference on avoiding getters. By not exposing an AuthorizationManager, it gives us the flexibility to change how DSL instructions like anyRequest.authenticated() are turned into Java objects without breaking passivity.

*/