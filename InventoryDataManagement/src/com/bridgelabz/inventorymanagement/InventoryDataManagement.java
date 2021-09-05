package com.bridgelabz.inventorymanagement;

import java.util.ArrayList;

public class InventoryDataManagement {

	public static void main(String[] args) {
		
		ArrayList<InventoryDetails> Inventory =new ArrayList<InventoryDetails>();
		
		InventoryDetails tempInventory = new InventoryDetails();
		tempInventory.setName("Wheat");
		tempInventory.setWeight(3);
		tempInventory.setPrice(45);
		Inventory.add(tempInventory);
		
		tempInventory = new InventoryDetails();
		tempInventory.setName("Pulses");
		tempInventory.setWeight(4);
		tempInventory.setPrice(60);
		Inventory.add(tempInventory);
		
		tempInventory = new InventoryDetails();
		tempInventory.setName("Rice");
		tempInventory.setWeight(2);
		tempInventory.setPrice(15);
		Inventory.add(tempInventory);
		
		for (int i = 0; i < Inventory.size(); i++)  {
			
			System.out.println("\n"+Inventory.get(i));
			System.out.println("Value: "+calculateInventoryValue(Inventory.get(i)));
			
		}

	}

	private static double calculateInventoryValue(InventoryDetails element) {
		
		return element.getWeight() * element.getPrice();
		
	}

}
