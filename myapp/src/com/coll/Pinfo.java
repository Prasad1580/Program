package com.coll;

	import java.util.ArrayList;

	public class Pinfo  {

		public static void main(String[] args) {
			Productinfo cc = new Productinfo();
			ArrayList<ProductColl> data = ((Productinfo) cc).pro();

			for (ProductColl product : data) {
				System.out.println(product);

			}

		}
		
		
	}


