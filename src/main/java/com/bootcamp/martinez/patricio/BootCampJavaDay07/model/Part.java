package com.bootcamp.martinez.patricio.BootCampJavaDay07.model;

public class Part {
	private int partID;
	private String partName;
	private String partColor;

	public Part() {

	}

	public Part(int partID, String partName, String partColor) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.partColor = partColor;
	}

	public int getPartID() {
		return partID;
	}

	public void setPartID(int partID) {
		this.partID = partID;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartColor() {
		return partColor;
	}

	public void setPartColor(String partColor) {
		this.partColor = partColor;
	}

	@Override
	public String toString() {
		return "Part [partID=" + partID + ", partName=" + partName + ", partColor=" + partColor + "]";
	}

}
