import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { UsersServiceService } from '../users-service.service';
import { Router } from "@angular/router";
import {ProductInformation} from "./../product-information";

@Component({
  selector: 'app-smartwatch',
  templateUrl: './smartwatch.component.html',
  styleUrls: ['./smartwatch.component.css']
})
export class SmartwatchComponent implements OnInit {

  products: Observable<any>;

  constructor(private userService: UsersServiceService, private router: Router) { }

  ngOnInit() {
  	  	this.reloadData();

  }
  reloadData(){
  	this.products = this.userService.getProductList1();
  }
 getProd(product_id:string,product_name:string,product_description:string,product_price:string,product_icon:string) {
    this.router.navigate(['details',product_id,product_name,product_description,product_price,product_icon]);
  }
}