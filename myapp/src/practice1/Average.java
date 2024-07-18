package practice1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enrer 1 no");
		 double a = sc.nextDouble();
		 
		 System.out.println("enter 2 no");
		 double b = sc.nextDouble();
		 
		 double avg = (a+b)/2;
		 System.out.println("total" + 
				 avg);
		
	}

}
