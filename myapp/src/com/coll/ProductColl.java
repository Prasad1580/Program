package com.coll;

public class ProductColl {

		private int id ;
		private String name ;
		private double price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		 public static void main(String[] args) {
			
		}
		 @Override
			public String toString() {
				return "ProductColl  [id=" + id + ", name=" + name + ", price=" + price + "]";
			}
		

	}


