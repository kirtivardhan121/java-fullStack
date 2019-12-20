import { NgForm } from '@angular/forms';
import { LibrarianService } from './../../../librarian.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatebook',
  templateUrl: './updatebook.component.html',
  styleUrls: ['./updatebook.component.css']
})
export class UpdatebookComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private librarianService: LibrarianService, private router: Router) { }

  updateBook(form: NgForm) {
    alert(`Book information updated`);
    this.error = null;
    this.librarianService.updateBook(form.value)
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
