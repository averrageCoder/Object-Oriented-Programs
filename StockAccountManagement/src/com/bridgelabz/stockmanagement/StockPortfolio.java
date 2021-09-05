package com.bridgelabz.stockmanagement;

import java.util.ArrayList;

public class StockPortfolio {

	public static void main(String[] args) {
		
		ArrayList<Stock> stockPortfolio = new ArrayList<>();
		
		Stock tempStock = new Stock();
		
		tempStock.setStockName("Reliance");
		tempStock.setNumOfShares(5);
		tempStock.setSharePrice(1200);
		stockPortfolio.add(tempStock);
		
		tempStock = new Stock();
		tempStock.setStockName("Idea");
		tempStock.setNumOfShares(15);
		tempStock.setSharePrice(200);
		stockPortfolio.add(tempStock);
		
		tempStock = new Stock();
		tempStock.setStockName("SBI");
		tempStock.setNumOfShares(45);
		tempStock.setSharePrice(100);
		stockPortfolio.add(tempStock);
		
		double valueOfStock , totalValue=0;
		for(Stock stock : stockPortfolio) {
			System.out.println(stock);
			valueOfStock=calculateStockValue(stock);
			totalValue+=valueOfStock;
			System.out.println("Value of Stock is "+valueOfStock);
		}
		System.out.println("\nPortfolio value: "+totalValue);
	}

	private static double calculateStockValue(Stock stock) {
		return stock.getNumOfShares() * stock.getSharePrice();
	}

}
