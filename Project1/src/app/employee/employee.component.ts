import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  standalone: true,
  imports: [],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {
   id:number;
   name:string;
   salary:number;

   constructor(){
    this.id=98989898;
    this.name='ram kumar';
    this.salary=56000;
   }
   

}
