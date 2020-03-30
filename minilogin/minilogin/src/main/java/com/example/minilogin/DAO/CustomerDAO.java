package com.example.minilogin.DAO;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.minilogin.model.Customer;
import com.example.minilogin.model.Customer;

@RestController
public interface CustomerDAO {
	public List<Customer> viewAllCustomer();
	public void updateCustomer(Customer customer);
	public Customer addCustomer(Customer customer);
	public int loginValidation(String username,String password);

}
