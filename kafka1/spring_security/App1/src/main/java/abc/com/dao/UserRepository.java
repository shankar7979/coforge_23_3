package abc.com.dao;

import org.springframework.data.repository.CrudRepository;

import abc.com.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    
  }
