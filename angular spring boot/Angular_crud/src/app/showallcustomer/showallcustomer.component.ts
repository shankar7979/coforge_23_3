import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { CustomerService } from '../service/customer.service';
import { Observable } from 'rxjs';
import { Customer } from '../model/customer';

@Component({
  selector: 'app-showallcustomer',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './showallcustomer.component.html',
  styleUrl: './showallcustomer.component.css'
})
export class ShowallcustomerComponent {
   customer: Observable<Customer[]>

  constructor(service:CustomerService){
    this.customer=service.getAllCustomer();
  }

}
