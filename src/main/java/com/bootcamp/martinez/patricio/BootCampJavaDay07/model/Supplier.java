package com.bootcamp.martinez.patricio.BootCampJavaDay07.model;

public class Supplier {
	private int supplierID;
	private String supplierName;
	private String supplierAddress;

	public Supplier() {

	}

	public Supplier(int supplierID, String supplierName, String supplierAddress) {
		super();
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Override
	public String toString() {
		return "Supplier [supplierID=" + supplierID + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + "]";
	}

}
