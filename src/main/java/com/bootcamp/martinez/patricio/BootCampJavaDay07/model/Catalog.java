package com.bootcamp.martinez.patricio.BootCampJavaDay07.model;

public class Catalog {
	private int idSupplier;
	private int idPart;
	private float coast;

	public Catalog() {

	}

	public Catalog(int idSupplier, int idPart, float coast) {
		super();
		this.idSupplier = idSupplier;
		this.idPart = idPart;
		this.coast = coast;
	}

	public int getIdSupplier() {
		return idSupplier;
	}

	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}

	public int getIdPart() {
		return idPart;
	}

	public void setIdPart(int idPart) {
		this.idPart = idPart;
	}

	public float getCoast() {
		return coast;
	}

	public void setCoast(float coast) {
		this.coast = coast;
	}

	@Override
	public String toString() {
		return "Catalog [idSupplier=" + idSupplier + ", idPart=" + idPart + ", coast=" + coast + "]";
	}

}
