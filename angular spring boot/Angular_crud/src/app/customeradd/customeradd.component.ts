import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { CustomerService } from '../service/customer.service';
import { Customer } from '../model/customer';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-customeradd',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './customeradd.component.html',
  styleUrl: './customeradd.component.css'
})
export class CustomeraddComponent {
  @Input() customer:Customer;
constructor(private service:CustomerService){
  this.customer=new Customer();
}
}
