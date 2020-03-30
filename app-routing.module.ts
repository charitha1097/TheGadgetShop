import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';

import { UserSignupComponent } from './user-signup/user-signup.component';

import { UserLoginComponent } from './user-login/user-login.component';

import { HomeComponent } from './home/home.component';

import { ProductInfoComponent } from './product-info/product-info.component';

import { ProductDetailsComponent } from './product-details/product-details.component';

import { BuynowComponent } from './buynow/buynow.component';
import { AddcartsComponent } from './addcarts/addcarts.component';
import { AddProductComponent } from './add-product/add-product.component';
import { MobileComponent } from './mobile/mobile.component';
import { LaptopComponent } from './laptop/laptop.component';
import { CameraComponent } from './camera/camera.component';
import { SmartwatchComponent } from './smartwatch/smartwatch.component';
import { ProductListAdminComponent } from './product-list-admin/product-list-admin.component';
import { LastpageComponent } from './lastpage/lastpage.component';
import { DetailsComponent } from './details/details.component';


const routes: Routes = [



{ path: '', redirectTo: 'users', pathMatch: 'full'},

{ path: 'users', component: UserSignupComponent},

{ path: 'login', component: UserLoginComponent},

{ path: 'home', component: HomeComponent},

{ path: 'products', component: ProductInfoComponent},

{ path: 'buy', component: BuynowComponent},



{ path: 'details/:product_id/:product_name/:product_description/:product_price/:product_icon', component: ProductDetailsComponent},

 {path: 'products1', component: MobileComponent},
{ path: 'products2', component: SmartwatchComponent},
{ path: 'products3', component: LaptopComponent},
{ path: 'products4', component: CameraComponent},
{path: 'Admin',component:ProductListAdminComponent },
{path: 'add',component:AddProductComponent },
{path: 'product',component:ProductListAdminComponent },
{path: 'finallybuy',component:LastpageComponent },
{path: 'adminproducts/:product_id/:product_name/:product_description/:product_price/:product_icon',component:DetailsComponent},


{ path: 'cart/:product_id/:product_name/:product_description/:product_price/:product_icon', component: AddcartsComponent},








];



@NgModule({

  imports: [RouterModule.forRoot(routes)],

  exports: [RouterModule]

})

export class AppRoutingModule { }