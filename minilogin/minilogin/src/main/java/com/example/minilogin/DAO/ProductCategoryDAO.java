package com.example.minilogin.DAO;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.minilogin.model.ProductCategory;

@RestController
public interface ProductCategoryDAO {
	
	public List<ProductCategory> viewAllProductCategory();
	public void updateProductCategory(ProductCategory productcat);
	public ProductCategory addProductCategory(ProductCategory productcat);
	//public void deleteProductCategory(int category_id);
}
