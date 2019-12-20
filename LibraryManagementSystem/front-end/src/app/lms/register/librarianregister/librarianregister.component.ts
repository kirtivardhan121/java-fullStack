import { FormGroup, Validators, FormControl, NgForm } from '@angular/forms';
import { AuthService } from './../../../auth.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-librarianregister',
  templateUrl: './librarianregister.component.html',
  styleUrls: ['./librarianregister.component.css']
})
export class LibrarianregisterComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private auth: AuthService, private router: Router) { }

  register(form: NgForm) {

    this.error = null;
    this.auth.registerLibrarian(form.value)
    .subscribe(res => {
      console.log('registration response', res);
      this.router.navigateByUrl('/llognin');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  ngOnInit() {
  }

  ngOnDestroy() {
  }
}
