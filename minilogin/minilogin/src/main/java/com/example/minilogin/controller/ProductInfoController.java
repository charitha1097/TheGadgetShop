package com.example.minilogin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.minilogin.DAO.ProductInfoDAO;
import com.example.minilogin.model.ProductInfo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductInfoController {
	@Autowired
	private ProductInfoDAO productInfo;
	
	@GetMapping("/products")
	public List getProducts() {	
	return productInfo.viewAllProducts();
	}
	@GetMapping("/details/{product_id}")
	public List getproductid(@PathVariable(value = "product_id") String id)
	{
		System.out.println(id);
		//System.out.println(name);
		System.out.println("xgfhjbkl");
		return productInfo.viewAllProducts1(id);
	}
	@GetMapping("/products1")
	public List getProducts1() {	
	return productInfo.viewAllProducts0();
}

	
	@GetMapping("/products2")

	public List getProducts2() {	

	return productInfo.viewAllProducts11();
}

		//clothes(2)
	@GetMapping("/products3")

	public List getProducts3() {	

	return productInfo.viewAllProducts2();
	
	
}
	//drinks(3)
	@GetMapping("/products4")

	public List getProducts4() {	

	return productInfo.viewAllProducts3();
	
	
}
	@PostMapping("/productadd")
	public ResponseEntity addProductInfo(@RequestBody ProductInfo product) {
		System.out.println("hello......");
		productInfo.addProductInfo(product);
		return new ResponseEntity(product, HttpStatus.OK);
	}
	@PutMapping("/product/{product_id}")
	public ResponseEntity<ProductInfo> updateProductInfo1(@PathVariable(value="product_id") String ProductInfoId, @Valid @RequestBody ProductInfo productDetails) {
		 productDetails.setProduct_id(productDetails.getProduct_id());
		 productDetails.setCategory_type(productDetails.getCategory_type());
		 productDetails.setProduct_description(productDetails.getProduct_description());
		 productDetails.setProduct_icon(productDetails.getProduct_icon());
		 productDetails.setProduct_name(productDetails.getProduct_name());
		 productDetails.setProduct_price(productDetails.getProduct_price());
		 productDetails.setProduct_status(productDetails.getProduct_status());
		 productDetails.setProduct_stock(productDetails.getProduct_stock());
		 productInfo.updateProductInfo(ProductInfoId, productDetails);
				return new ResponseEntity(productDetails, HttpStatus.OK);		
	}
	@DeleteMapping("/products/{product_id}")
	public ResponseEntity<ProductInfo> deleteProductInfo1(@PathVariable (value="product_id") String ProductInfoId) {
		productInfo.deleteProductInfo(ProductInfoId);
		System.out.println("Deleted");
				return new ResponseEntity(ProductInfoId,HttpStatus.OK);		
	}
	/*
	 * public Map<String,Boolean> deleteProductInfo(@PathVariable(value="id") Long
	 * ProductInfoId) throws ResourceNotFoundException{ ProductInfo
	 * ProductInfo=ProductInfoRepository.findById(ProductInfoId) .orElseThrow(() ->
	 * new ResourceNotFoundException("ProductInfo not found for this id ::"
	 * +ProductInfoId)); ProductInfoRepository.delete(ProductInfo);
	 * Map<String,Boolean> response=new HashMap<>();
	 * response.put("deleted",Boolean.TRUE); return response; }
	 */
	
}
	
