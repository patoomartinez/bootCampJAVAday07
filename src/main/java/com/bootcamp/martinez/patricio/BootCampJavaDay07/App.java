package com.bootcamp.martinez.patricio.BootCampJavaDay07;

import java.util.Scanner;


import com.bootcamp.martinez.patricio.BootCampJavaDay07.controller.ConexionJDBCs;
import com.bootcamp.martinez.patricio.BootCampJavaDay07.controller.PruebaDB;
import com.bootcamp.martinez.patricio.BootCampJavaDay07.view.View;


public class App {
	static View vistaMenu = new View();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		PruebaDB test = new PruebaDB();
		ConexionJDBCs.getConnection();
		int opcion;
		do {
			vistaMenu.mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				test.viewGreenPartsSupplier();
				System.out.println("*************************");
				break;
			case 2:
				test.viewGreenAndRedPartsSupplier();
				System.out.println("*************************");
				break;
			case 3:
				vistaMenu.insertOldNewSupplierName();
				String oldName = sc.next();
				String newName = sc.next();
				test.updateSupplier(oldName, newName);
				break;
			case 4:
				vistaMenu.insertIdSupplierIdParts();
				int idSupplier = sc.nextInt();
				int idParts = sc.nextInt();
				test.updatePrice(idSupplier, idParts);
				break;
			case 5:
				vistaMenu.supplierName();
				String supplierName = sc.next();
				test.removeSupplier(supplierName);
				break;
			default:
				break;
			}

		} while (opcion != 0);
	}
}
