import { Router } from '@angular/router';
import { StudentService } from './../../../student.service';
import { LibrarianService } from './../../../librarian.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-deletebook',
  templateUrl: './deletebook.component.html',
  styleUrls: ['./deletebook.component.css']
})
export class DeletebookComponent implements OnInit {

  myBook;

  constructor(private libraryServive: LibrarianService, private studentService: StudentService, private router: Router) { }

  getBook(id) {
    this.studentService.getBook(id).subscribe(res => {
      console.log(res.book);
      this.myBook = res.book;
      console.log('my book', this.myBook);
    }, err => {
      console.log(err);
    });
  }

  deleteBook(id: any) {
    console.log('Book information deleted');
    this.libraryServive.deleteBook(id).subscribe( res => {
      console.log(res);
      this.myBook = res.book;
      this.router.navigateByUrl('/librarian');
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
