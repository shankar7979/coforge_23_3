import { Routes } from '@angular/router';
import { CustomerComponent } from './customer/customer.component';
import { ProductComponent } from './product/product.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';

export const routes: Routes = [
  { path: '', component: CustomerComponent },
  { path: 'customer', component: CustomerComponent },
  { path: 'product', component: ProductComponent},
  //{ path: 'searchproduct/:id', component: SearchproductComponent}
  { path: 'searchproduct/:id/:name', component: SearchproductComponent}
];

