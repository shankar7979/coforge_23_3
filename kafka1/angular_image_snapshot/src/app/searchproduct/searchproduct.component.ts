import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-searchproduct',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './searchproduct.component.html',
  styleUrl: './searchproduct.component.css'
})
export class SearchproductComponent {
  prdid:string='';
  prdname:string='';
  constructor(private route:ActivatedRoute){}

  ngOnInit(): void {

    this.prdid=this.route.snapshot.params['id']
    this.prdname=this.route.snapshot.params['name']

    // this.prdid=this.route.snapshot.paramMap.get("id");
    console.log('search parameter id is '+this.prdid)
    console.log('search parameter name  is '+this.prdname)
  }
}
