package com.example.minilogin.DAOimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.minilogin.DAO.ProductCategoryDAO;
import com.example.minilogin.model.ProductCategory;
import com.example.minilogin.util.DButil;

@RestController
public class ProductCategoryDaoImpl implements ProductCategoryDAO {
	static List<ProductCategory> list1=new ArrayList();
	Connection connection;
	
	public ProductCategoryDaoImpl() {
		connection = DButil.getConnection();
		System.out.println("connection" + connection);
	}	
	
	public List<ProductCategory> viewAllProductCategory(){
		//List<Customer> customer = new ArrayList<Customer>();		
		System.out.println("Inside viewAll products");
		try {
			list1.clear();
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from product_category");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ProductCategory productcat=new ProductCategory();
				System.out.println("Inside while");
				productcat.setCategory_id(rs.getInt(1));
				productcat.setCategory_name(rs.getString(2));
				productcat.setCategory_type(rs.getInt(3));
				productcat.setCreate_time(rs.getDate(4));
				productcat.setUpdate_time(rs.getDate(5));
				System.out.println("Inside while-2");
				list1.add(productcat);
				System.out.println(list1);
				
			}
			}catch(Exception e) {}
		return list1;
	}

	public void updateProductCategory(ProductCategory productcat) {}
	public ProductCategory addProductCategory(ProductCategory productcat) {
		int noOfRecords=0;
		try {
		PreparedStatement pst = connection.prepareStatement("Insert into product_category(category_id, category_name, category_type, create_time, update_time) values(?,?,?,?,?)");
		pst.setInt(1,productcat.getCategory_id());
		pst.setString(2,productcat.getCategory_name());
		pst.setInt(3,productcat.getCategory_type());
		pst.setDate(4, productcat.getCreate_time());
		pst.setDate(5,productcat.getUpdate_time());
		
		noOfRecords=pst.executeUpdate();
		
		System.out.println(noOfRecords+ "record inserted successfully");
		}catch(Exception e) {}
		return productcat;
	}

}
