import { Router } from '@angular/router';
import { StudentService } from './../../student.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  error = null;
  myBook ;

  constructor(private studentService: StudentService, private router: Router) { }

  getBook(id) {
    this.studentService.getBook(id).subscribe(res => {
      console.log('books are', res.book);
      this.myBook = res.book;
      console.log('my book', this.myBook);
    }, err => {
      console.log(err);
    });
    if (this.myBook.bid === null) {
      alert(`Book Not Found`);
    }
  }

  requestBook(bid) {
    alert(`Book Requested`);
    console.log(bid);
    const rollno = JSON.parse(localStorage.getItem('userDetails'));
    this.studentService.requestBook(rollno, bid).subscribe(res => {
      console.log(res);
      this.router.navigateByUrl('/student');
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

}
