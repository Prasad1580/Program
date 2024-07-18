package com.product;

public class Product {
	 int productId;
	 String productName;
	 double price;
	 int quantityStock;
	public Product(int productId, String productName, double price, int quantityStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityStock = quantityStock;
	}
	Product(){
		
	}
	void productinfo() {
		System.out.println("product Id:" +this.productId);
		System.out.println("product name:"+this.productName);
		System.out.println("product price:"+this.price);
		System.out.println("product quantity:"+this.quantityStock);

	}
	void borrowProduct(int quantity) {
		this.quantityStock = this.quantityStock-quantity;
		System.out.println("This is Avalable stock =" + this.quantityStock);
	}

	
	public static void main(String[] args) {
		Product p1 = new Product(1,"mobile", 5222.6, 800);
		Product p2 = new Product(2,"charger", 52.7, 200);
	
		p1.productinfo();
		p1.borrowProduct(522);
	
		System.out.println("******************************");
		
		
		p2.productinfo();
		p2.borrowProduct(82);
	}
	
}
