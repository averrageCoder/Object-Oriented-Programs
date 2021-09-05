package com.bridgelabz.stockmanagement;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.bridgelabz.datastructures.MyNode;
import com.bridgelabz.datastructures.MyQueue;

public class StockAccount {

	private static ArrayList<Stock> stockAccount = new ArrayList<>();
	private static MyQueue transactions = new MyQueue();
	
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
				MyNode<CompanyShares> tempNode = new MyNode<CompanyShares>(tempTransaction);
				transactions.enqueue(tempNode);
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
					MyNode<CompanyShares> tempNode = new MyNode<CompanyShares>(tempTransaction);
					transactions.enqueue(tempNode);
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

		if(transactions.getSize() > 0) {
			System.out.println("\nTransactions: ");
			transactions.printQueue();
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
