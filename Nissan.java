package com.car;

public class Nissan implements Car {

	
     private String brand_name; 
	 private int model_no;
	 private String model_name;
	 
	 
	 
	public void showFeatures() {
     System.out.println("Brand Name: "+brand_name);
     System.out.println("The Model Number is : " +model_no);
	 System.out.println("The Model Name is : "+model_name);
	}

	
	


	public Nissan(int model_no, String model_name, String brand_name) {
		super();
		this.model_no = model_no;
		this.model_name = model_name;
		this.brand_name = brand_name;
	}

	
}