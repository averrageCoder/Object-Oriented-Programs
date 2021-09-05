package com.bridgelabz.stockmanagement;

public class Stock {

	private String stockName;
	private double numOfShares;
	private double sharePrice;
	
	public Stock() {
		this.stockName = null;
		this.numOfShares = 0;
		this.sharePrice = 0;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getNumOfShares() {
		return numOfShares;
	}
	@Override
	public String toString() {
		return "Stock {stockName=" + stockName + ", numOfShares=" + numOfShares + ", sharePrice=" + sharePrice + "}";
	}
	public void setNumOfShares(double numOfShares) {
		this.numOfShares = numOfShares;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
		
}
