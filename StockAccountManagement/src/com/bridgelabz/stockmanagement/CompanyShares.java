package com.bridgelabz.stockmanagement;
import java.time.LocalDateTime; 

public class CompanyShares {
	
	private String symbol;
	private double numOfShares;
	private LocalDateTime transactionDateTime;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(double numOfShares) {
		this.numOfShares = numOfShares;
	}
	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	@Override
	public String toString() {
		return "CompanyShares [symbol=" + symbol + ", numOfShares=" + numOfShares + ", transactionDateTime="
				+ transactionDateTime + "]";
	}

}
