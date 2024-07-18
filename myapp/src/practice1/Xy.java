package practice1;

import java.util.*;

public class Xy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double r ;
     double area ;
     
      Scanner s = new Scanner (System.in);
      System.out.println("enter r=");
      
      r= s.nextDouble();
      area = Math.PI*r*r;
      System.out.println("area of circle="+area);
      
	
		// perimeter of circle 
      
  double  perimeter = 2*Math.PI*r;
    System.out.println("perimeter of circle="+perimeter);
 
      
	} 

}
