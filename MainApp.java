package com.car;

public class MainApp {
	
	public static void main(String args[]) {

	Car c1 = new Nissan(145,"Micra","Nissan");
     c1.showFeatures();
     
     Car c2 = new Toyoto(267,"Fortunar","Toyoto");
	  c2.showFeatures();
}
}