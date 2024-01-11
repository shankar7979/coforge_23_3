import { Component } from '@angular/core';
import { ExponentPipe } from "./exponent.pipe";

@Component({
    selector: 'app-pipe-example',
    standalone: true,
    templateUrl: './pipe-example.component.html',
    styleUrl: './pipe-example.component.css',
    imports: [ExponentPipe]
})
export class PipeExampleComponent {

   n1:number;
   n2:number;

   constructor(){
     this.n1=3;
     this.n2=2;
   }

}
