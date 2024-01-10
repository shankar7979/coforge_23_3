import { Component } from '@angular/core';
import { Person } from './model/person';

@Component({
  selector: 'app-person',
  standalone: true,
  imports: [],
  templateUrl: './person.component.html',
  styleUrl: './person.component.css'
})
export class PersonComponent {
 person: Person;

 constructor(){
   this.person=new Person();
 }
}
