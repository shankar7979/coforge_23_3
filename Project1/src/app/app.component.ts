import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { EmployeeComponent } from "./employee/employee.component";
import { CustomerComponent } from './customer/customer.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RouterOutlet, EmployeeComponent,
       CustomerComponent]
})
export class AppComponent {
  title = 'Project1';
}
