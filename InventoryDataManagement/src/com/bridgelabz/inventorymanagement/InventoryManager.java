package com.bridgelabz.inventorymanagement;

import java.util.ArrayList;

public class InventoryManager {

	public static void main(String[] args) {
		
		InventoryFactory inventoryFactory = new InventoryFactory();
		inventoryFactory.createInventory();
		
		ArrayList<InventoryDetails> Inventory = inventoryFactory.getInventory();
		
		for (int i = 0; i < Inventory.size(); i++)  {
			
			System.out.println("\n"+Inventory.get(i));
			System.out.println("Value: "+calculateInventoryValue(Inventory.get(i)));
			
		}

	}
	
	private static double calculateInventoryValue(InventoryDetails element) {
		
		return element.getWeight() * element.getPrice();
		
	}


}
