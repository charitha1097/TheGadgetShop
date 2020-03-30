import { Component, OnInit } from '@angular/core';
import {ProductInformation} from "./../product-information";
import { UsersServiceService } from '../users-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  product = new ProductInformation();
	submitted = false;

  constructor(private userService: UsersServiceService, private router: Router) { }

  ngOnInit() {

  }

  newProduct() : void{
  	this.submitted = false;
  	this.product = new ProductInformation();
  }

  save(){
  	this.userService.createProduct(this.product)
  	.subscribe(data => console.log(data),error => console.log(error));
  	this.product=new ProductInformation();
  	this.gotoList();
  }

  onSubmit(){
  	this.submitted=true;
  	this.save();
  }

  gotoList(){
  	this.router.navigate(['addproduct']);
  }

}