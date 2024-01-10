import { Component } from '@angular/core';
import  {Customer} from './model/customer';
import  {customerdata} from './data/customerdata';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
 customer:Customer[];

 constructor(){
   this.customer=customerdata;
 }

}
