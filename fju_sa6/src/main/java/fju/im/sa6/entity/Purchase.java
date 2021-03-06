package fju.im.sa6.entity;

import java.util.Date;

public class Purchase extends Inventory {

	private String purchaseName;

	private int purchaseNum;

	private double purchasePrice;

	private Date purchaseDate;

	public Purchase(int inventoryNum, int purchaseNum, int inventoryAmount, int supplierNum, String purchaseName,
			int purchaseNum2, double purchasePrice, Date purchaseDate) {
		super(inventoryNum, purchaseNum, inventoryAmount, supplierNum);
		this.purchaseName = purchaseName;
		purchaseNum = purchaseNum2;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseName() {
		return purchaseName;
	}

	public void setPurchaseName(String purchaseName) {
		this.purchaseName = purchaseName;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getPurchaseNum() {
		return purchaseNum;
	}
	
	



}
