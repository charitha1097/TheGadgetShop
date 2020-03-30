package com.example.minilogin.DAO;

import java.util.List;

import com.example.minilogin.model.ProductInfo;

public interface ProductInfoDAO {
	public List<ProductInfo> viewAllProducts();
public List<ProductInfo> viewAllProducts0();
	
	public List<ProductInfo> viewAllProducts11();
	public List<ProductInfo> viewAllProducts2();
	public List<ProductInfo> viewAllProducts3();
	/* public List<ProductInfo> getProd(); */
	public void updateProductInfo(String product_id,ProductInfo product);
	public ProductInfo addProductInfo(ProductInfo product);
	public void deleteProductInfo(String product_id);
	
	public List<ProductInfo> viewAllProducts1(String id);
}