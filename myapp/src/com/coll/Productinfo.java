package com.coll;


	import java.util.ArrayList;

	public class Productinfo {

		ArrayList<ProductColl> pro() {

			ProductColl e1 = new ProductColl();
			e1.setId(1);
			e1.setName("gold");
			e1.setPrice(62000);

			ProductColl e2 = new ProductColl();
			e2.setId(2);
			e2.setName("silver");
			e2.setPrice(10000);

			ProductColl e3 = new ProductColl();
			e3.setId(3);
			e3.setName("diamond");
			e3.setPrice(70000);

			

			ArrayList<ProductColl> al = new ArrayList<>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			


			for (ProductColl product : al) {

					System.out.println(product);
				}
				return al;
			}
			
		
		

		public static void main(String args[])
		{
			Productinfo f=new Productinfo();
			ArrayList<ProductColl> c=f.pro();
		}

	}



