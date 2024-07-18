package practice2;
import java.util.*;

public class CompoundInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p,r,t;
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal");
		p= s.nextInt();
		
		System.out.println("enter rate");
		r=s.nextInt();
		
		System.out.println("enter time");
		t = s.nextInt();
		int i = (p*t*r)/100;
		System.out.println("Simple int "+i);
		
		double com = p*Math.pow(1+r/100),t);
		
		double c = com-p;
	}


}
