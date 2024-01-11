import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { User } from './model/User';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
   user:User;
   constructor(){
    //this.user=new User(10001,'aman kumar',20000);
    this.user=new User(0,'',0);
   }
}
