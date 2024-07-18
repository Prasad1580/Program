package com.stat;

public class InventoryItem {

 
	private static int totalItems = 0;

	    private String itemName;
	    private int quantity;

	    public InventoryItem(String itemName, int quantity) {
	        this.itemName = itemName;
	        this.quantity = quantity;
	        totalItems += quantity;
	        
	    }

	
	    public void displayItemDetails() {
	        System.out.println("Item: " + itemName);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Items in Stock: " + totalItems);
	    }

	    public static void main(String[] args) {
	        InventoryItem item1 = new InventoryItem("Product A", 70);
	        InventoryItem item2 = new InventoryItem("Product B", 60);

	        item1.displayItemDetails();
	        System.out.println();
	        item2.displayItemDetails();
	    }
	}





