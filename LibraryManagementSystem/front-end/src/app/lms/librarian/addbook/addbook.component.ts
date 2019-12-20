import { NgForm } from '@angular/forms';
import { LibrarianService } from './../../../librarian.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private librarianService: LibrarianService, private router: Router) { }

  addBook(form: NgForm) {
    alert(`Book Added`);
    this.error = null;
    this.librarianService.addBook(form.value)
    .subscribe(res => {
      console.log('Response', res);
      this.router.navigateByUrl('/librarian');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }

  ngOnInit() {
  }

  ngOnDestroy() {
    this.error = null;
  }
}
