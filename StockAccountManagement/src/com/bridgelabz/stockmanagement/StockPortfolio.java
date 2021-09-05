package com.bridgelabz.stockmanagement;

import java.util.ArrayList;

public class StockPortfolio {

	public static void main(String[] args) {
		
		StockAccount stockAccount = new StockAccount();
		System.out.println("Initial portfolio: ");
		stockAccount.printReport();
		System.out.println();
		
		stockAccount.buy(10, "Reliance");
		stockAccount.sell(3, "Idea");
		
		stockAccount.printReport();
		
	}

}
