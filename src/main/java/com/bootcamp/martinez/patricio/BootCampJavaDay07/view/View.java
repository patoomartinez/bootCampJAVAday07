package com.bootcamp.martinez.patricio.BootCampJavaDay07.view;

import java.util.Scanner;

public class View {
	public void mostrarMenu() {
		System.out.println("Welcome");
		System.out.println("1) Print name/total number of [green]parts of Supplier.");
		System.out.println("2) print name of supplier and price of the most expensive [green and red]parts that she supplies");
		System.out.println("3) Update supplier");
		System.out.println("4) Update price");
		System.out.println("5) Remove supplier");
		System.out.println("0) Exit");

	}
	
	public void insertOldNewSupplierName(){
		
		System.out.println("Write the name of the supplier you want to replace followed by the new name ");
		
	}
	public void insertIdSupplierIdParts(){
		
		System.out.println("Enter id Supplier and id Part in order to update their cost ");
		
	}
	public void supplierName(){
		
		System.out.println("write down supplier name");
		
	}
}
