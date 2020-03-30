package com.example.minilogin.model;
import java.sql.Date;

public class ProductCategory {
	
	private int category_id;
	private String category_name;
	private int category_type;
	private Date create_time;
	private Date update_time;
	
	
	public ProductCategory(int category_id, String category_name, int category_type, Date create_time,
			Date update_time) {
		
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_type = category_type;
		this.create_time = create_time;
		this.update_time = update_time;
	}


	public ProductCategory() {
		super();
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public int getCategory_type() {
		return category_type;
	}


	public void setCategory_type(int category_type) {
		this.category_type = category_type;
	}


	public Date getCreate_time() {
		return create_time;
	}


	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}


	public Date getUpdate_time() {
		return update_time;
	}


	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}


	@Override
	public String toString() {
		return "ProductCategory [category_id=" + category_id + ", category_name=" + category_name + ", category_type="
				+ category_type + ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}

	
}
