package com.example.minilogin.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.minilogin.DAO.CustomerDAO;
import com.example.minilogin.model.Customer;
import com.example.minilogin.util.DButil;

@RestController
public class CustomerDaoImpl implements CustomerDAO{
	static List<Customer> list1=new ArrayList();
	Connection connection;
	
	public CustomerDaoImpl() {
		connection = DButil.getConnection();
		System.out.println("connection" + connection);
	}	
	public List<Customer> viewAllCustomer(){
		//List<Customer> customer = new ArrayList<Customer>();		
		System.out.println("Inside viewAll customer");
		try {
			
			System.out.println("Inside try");
			PreparedStatement stmt = connection.prepareStatement("select * from customer");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Customer cust=new Customer();
				System.out.println("Inside while");
				cust.setId(rs.getInt(1));
				cust.setUsername(rs.getString(2));
				cust.setPassword(rs.getString(3));
				cust.setEmail(rs.getString(4));
				cust.setPhone(rs.getLong(5));
				System.out.println("Inside while-2");
				list1.add(cust);
				System.out.println(list1);
				
			}
			}catch(Exception e) {}
		return list1;
	}

	public void updateCustomer(Customer customer) {}
	public Customer addCustomer(Customer customer) {
		int noOfRecords=0;
		try {
		PreparedStatement pst = connection.prepareStatement("Insert into customer(username,password,email,phone) values(?,?,?,?,?)");
		pst.setString(1,customer.getUsername());
		pst.setString(2,customer.getPassword());
		pst.setString(3, customer.getEmail());
		pst.setLong(4,customer.getPhone());
		noOfRecords=pst.executeUpdate();
		System.out.println(noOfRecords+ "record inserted successfully");
		}catch(Exception e) {}
		return customer;
	}
	
	@Override
	public int loginValidation(String username,String password){
		int flag=0;
		for (Customer c:list1) {
			System.out.println("Customer data----"+c);
			if (c.getUsername().equals(username)  && c.getPassword().equals(password)) {
				flag=1;							
				//return flag;
			}
		}
		System.out.println("flag"+flag);
		return flag;
	}

}
