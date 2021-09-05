package com.bridgelabz.inventorymanagement;

public class InventoryDetails {
	private String name;
	private double weight;
	private double price;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "InventoryDetails:{name=" + this.name + ", weight=" + this.weight + ", price=" + this.price + "}";
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}