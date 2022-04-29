package com.edu;

public class Product {
	private int pid;
	private String pname;
	private float price;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void display() {
		
		System.out.println("Product id ="+pid);
		System.out.println("Product name="+pname);
		System.out.println("Product price="+price);
		
	}

}
