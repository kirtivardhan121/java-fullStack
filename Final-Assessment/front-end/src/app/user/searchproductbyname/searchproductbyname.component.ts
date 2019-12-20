import { ProductserviceService } from './../../productservice.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchproductbyname',
  templateUrl: './searchproductbyname.component.html',
  styleUrls: ['./searchproductbyname.component.css']
})
export class SearchproductbynameComponent implements OnInit {

  error = null;
  myProduct: string;
  constructor(private service: ProductserviceService, private router: Router) { }

  getProduct(name) {
    this.service.searchProduct(name).subscribe(res => {
      console.log('products are', res.product);
      this.myProduct = res.product;
      console.log('my Product', this.myProduct);
    }, err => {
      console.log(err);
    });

  }
  ngOnInit() {
  }

}
