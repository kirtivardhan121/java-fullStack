import { LibrarianService } from './../../../librarian.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-show-all',
  templateUrl: './show-all.component.html',
  styleUrls: ['./show-all.component.css']
})
export class ShowAllComponent implements OnInit {

  books: any = [];

  constructor(private librarianService: LibrarianService) {
    this.getBook();
   }

  getBook() {
    this.librarianService.getBook().subscribe(res => {
      this.books = res.book as string [];
      console.log('res', res);
      console.log(this.books);
    });
  }
  ngOnInit() {
  }

}
