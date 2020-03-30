package com.example.minilogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.minilogin.DAO.ProductCategoryDAO;
import com.example.minilogin.model.ProductCategory;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryDAO productcatDao;
	
	@GetMapping("/productcategory")
	public List getProductcategory() {	
	return productcatDao.viewAllProductCategory();
}

	
	@PostMapping(value = "/post/productcategory")
	public ResponseEntity addProductInfo(@RequestBody ProductCategory productcat) {
		productcatDao.addProductCategory(productcat);
		return new ResponseEntity(productcat, HttpStatus.OK);
	}

}
