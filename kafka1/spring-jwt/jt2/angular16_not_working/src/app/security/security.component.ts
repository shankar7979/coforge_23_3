import { Component, OnInit } from '@angular/core';
import { JwtClientService } from '../jwt-client.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-security',
  templateUrl: './security.component.html',
  styleUrls: ['./security.component.css']
})
export class SecurityComponent implements OnInit {

  // authRequest: any = {
  //   "userName": "shankar",
  //   "password": "password"
  // };

  authRequest: any = {
    "userName": "",
    "password": ""
  };

  response: any;

  constructor(private service: JwtClientService,private route:ActivatedRoute) { }

  ngOnInit() {
    console.log('ngInit called '+JSON.stringify(this.authRequest));
    
    this.authRequest.userName=this.route.snapshot.params['uname']
    this.authRequest.password=this.route.snapshot.params['upass']
    this.getAccessToken(this.authRequest);
  }

  public getAccessToken(authRequest: any) {
    let resp = this.service.generateToken(authRequest);
    resp.subscribe(data => this.accessApi(data));
  }

  public accessApi(token: any) {
    let resp = this.service.welcome(token);
    resp.subscribe(data => this.response = data);
  }
}
