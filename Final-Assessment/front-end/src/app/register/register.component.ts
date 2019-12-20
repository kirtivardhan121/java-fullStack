import { UserserviceService } from './../userservice.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private user: UserserviceService, private router: Router) { }

  register(form: NgForm) {

    this.error = null;
    this.user.userRegister(form.value)
    .subscribe( res => {
      console.log('Registration response', res);
      this.router.navigateByUrl('/login');
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
