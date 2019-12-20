import { NgForm } from '@angular/forms';
import { AuthService } from './../../auth.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-librarianlogin',
  templateUrl: './librarianlogin.component.html',
  styleUrls: ['./librarianlogin.component.css']
})
export class LibrarianloginComponent implements OnInit {

  error: string;

  constructor(private auth: AuthService, private router: Router) { }

  login(form: NgForm) {

    this.error = null;
    console.log(form.value);
    this.auth.loginLibrarian(form.value)
    .subscribe(data => {
    console.log('Response of login', data);
    if (data && data.description === 'Login Successfully') {
      localStorage.setItem('userDetails', JSON.stringify(data));
      this.router.navigateByUrl('/librarian');
    }
    form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
