import { Component, Input } from '@angular/core';
import { Product } from './Product';
import { CommonModule } from '@angular/common';
import {  Router, RouterLink, RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-product',
  standalone: true,
  imports: [CommonModule,FormsModule,RouterOutlet,RouterLink],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {
@Input() prd:Product[];
@Input() prd1:Product;
//@Input() id:string='';

 constructor(private router:Router){
  this.prd=[
    {"id":10001,"name":"book","cost":1200},
    {"id":10002,"name":"shirt","cost":900},
    {"id":10003,"name":"pant","cost":1600},
    {"id":10004,"name":"icecream","cost":100},
    {"id":10005,"name":"laddu","cost":230},
    {"id":10006,"name":"shoe","cost":1400},
  ]
  this.prd1=this.prd[0];
 }
 search(){
 // console.log('id in product component  is '+this.id)
  //alert('id in product component  is '+this.id)
  // this.router.navigate(['/searchproduct',this.id])
  //alert('search id is '+this.prd1.id)
  //alert('search name is '+this.prd1.name)

  this.router.navigate(['/searchproduct',this.prd1.id,this.prd1.name])

   //this.router.navigate(['/searchproduct',id1])

 }
}
