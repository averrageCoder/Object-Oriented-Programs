package com.bridgelabz.stockmanagement;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class StockAccount {

	private static ArrayList<Stock> stockAccount = new ArrayList<>();
	private static ArrayList<CompanyShares> transactions = new ArrayList<>();

	public StockAccount() {

		Stock tempStock = new Stock();

		tempStock.setStockName("Reliance");
		tempStock.setNumOfShares(5);
		tempStock.setSharePrice(1200);
		stockAccount.add(tempStock);

		tempStock = new Stock();
		tempStock.setStockName("Idea");
		tempStock.setNumOfShares(15);
		tempStock.setSharePrice(200);
		stockAccount.add(tempStock);

		tempStock = new Stock();
		tempStock.setStockName("SBI");
		tempStock.setNumOfShares(45);
		tempStock.setSharePrice(100);
		stockAccount.add(tempStock);

	}

	public void buy(int amount, String symbol) {
		boolean flag = false;
		for(Stock stock: stockAccount) {
			if(stock.getStockName().equals(symbol)) {
				stock.setNumOfShares(stock.getNumOfShares()+amount);
				CompanyShares tempTransaction = new CompanyShares();
				LocalDateTime dateObj = LocalDateTime.now();
				tempTransaction.setSymbol(symbol);
				tempTransaction.setNumOfShares(amount);
				tempTransaction.setTransactionDateTime(dateObj);
				transactions.add(tempTransaction);
				flag=true;
			}
		}
		if(!flag)
			System.out.println("Stock not found");
	}

	public void sell(int amount, String symbol) {
		boolean flag = false;
		for(Stock stock: stockAccount) {
			if(stock.getStockName().equals(symbol)) {
				flag=true;
				if(stock.getNumOfShares()-amount < 0) 
					System.out.println("No enough stocks to sell");
				else {
					stock.setNumOfShares(stock.getNumOfShares()-amount);
					CompanyShares tempTransaction = new CompanyShares();
					LocalDateTime dateObj = LocalDateTime.now();
					tempTransaction.setSymbol(symbol);
					tempTransaction.setNumOfShares(amount*-1);
					tempTransaction.setTransactionDateTime(dateObj);
					transactions.add(tempTransaction);
				}
			}
		}
		if(!flag)
			System.out.println("Stock not found");
	}

	public void printReport() {
		double valueOfStock , totalValue=0;
		for(Stock stock : stockAccount) {
			System.out.println(stock);
			valueOfStock=calculateStockValue(stock);
			totalValue+=valueOfStock;
			System.out.println("Value of Stock is "+valueOfStock);
		}
		System.out.println("\nPortfolio value: "+this.valueOf());

		if(transactions.size() > 0) {
			System.out.println("\nTransactions: ");
			for(CompanyShares transaction: transactions) {
				System.out.println(transaction);
			}
		}
	}

	private double calculateStockValue(Stock stock) {
		return stock.getNumOfShares() * stock.getSharePrice();
	}

	public double valueOf() {
		double valueOfStock , totalValue=0;
		for(Stock stock : stockAccount) {
			valueOfStock=calculateStockValue(stock);
			totalValue+=valueOfStock;
		}
		return totalValue;
	}

}
