import { NgForm } from '@angular/forms';
import { AuthService } from './../../auth.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrls: ['./studentlogin.component.css']
})
export class StudentloginComponent implements OnInit {

  error: string;

  constructor(private auth: AuthService, private router: Router) { }


  login(form: NgForm) {

    this.error = null;
    console.log(form.value);
    this.auth.loginStudent(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data !== null) {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/student');
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
