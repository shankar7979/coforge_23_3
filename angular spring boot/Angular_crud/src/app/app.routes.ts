import { Routes } from '@angular/router';
import { ShowallcustomerComponent } from './showallcustomer/showallcustomer.component';
import { CustomeraddComponent } from './customeradd/customeradd.component';

export const routes: Routes = [
    {path:'',component:CustomeraddComponent},
    {path:'add',component:CustomeraddComponent},
    {path:'showall',component:ShowallcustomerComponent},
];
