import { ProductserviceService } from './../../productservice.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modifyproduct',
  templateUrl: './modifyproduct.component.html',
  styleUrls: ['./modifyproduct.component.css']
})
export class ModifyproductComponent implements OnInit, OnDestroy {

  error: string;
  constructor(private service: ProductserviceService, private router: Router) { }

  updateProduct(form: NgForm) {

    this.error = null;
    this.service.modifyProduct(form.value)
    .subscribe(res => {
      console.log('Response', res);
      this.router.navigateByUrl('/user');
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
