import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { Book } from './model/book';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})

export class BookComponent {
  book: Book;
  constructor() {
    this.book = new Book();
  }
}
