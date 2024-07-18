package practice2;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		
int a,b,c;
  Scanner s = new Scanner (System.in);
  System.out.println("enter a and b");
  a= s.nextInt();
  b = s.nextInt();
  System.out.println("before swap a="+a+ " b="+b);
  
  c=a;
  a=b;
  b=c;
  System.out.println("after swap a="+a+" b="+b);
  
  
	}
  
}
