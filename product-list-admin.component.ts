import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Router,ActivatedRoute } from '@angular/router';
import {ProductInformation} from "./../product-information";
import { UsersServiceService } from '../users-service.service';

import { ProductInfoComponent } from './../product-info/product-info.component';
@Component({
  selector: 'app-product-list-admin',
  templateUrl: './product-list-admin.component.html',
  styleUrls: ['./product-list-admin.component.css']
})
export class ProductListAdminComponent implements OnInit {

  id:number;

	product: Observable<ProductInformation[]>;

  constructor(private route:ActivatedRoute,private userService: UsersServiceService,
  	private router: Router) { }

  ngOnInit(){
    this.reloadData();
  }
     reloadData(){
    this.product=this.userService.getProductList();
  } 

  updateProduct(id:number, product:Object){
    this.router.navigate(['update',id]);
  }

  addProduct(){
    this.router.navigate(['add']);
  }

  getProd(product_id:string,product_name:string,product_description:string,product_price:string,product_icon:string) {
    this.router.navigate(['adminproducts',product_id,product_name,product_description,product_price,product_icon]);
  }
  deleteProduct(id:number)
  {
  this.userService.deleteProduct(id).subscribe(data=>{console.log(data);
   this.reloadData();},error=>console.log(error));
  }


}
