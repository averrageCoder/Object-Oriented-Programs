package com.bridgelabz.inventorymanagement;

import java.util.ArrayList;

public class InventoryFactory {

	private ArrayList<InventoryDetails> Inventory;
	
	public void createInventory() {
		
		Inventory = new ArrayList<>();
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
		
	}
	
	public ArrayList<InventoryDetails> getInventory() {
		return Inventory;
	}
	
}
