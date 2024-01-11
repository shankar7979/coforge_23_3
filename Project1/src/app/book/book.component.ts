import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Book } from './model/book';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule,FormsModule],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})

export class BookComponent {
 @Input() book: Book;
  constructor() {
    this.book = new Book();
  }
}
