package practice2;
import java.util.*;

public class Marks {

	public static void main(String[] args) {
	
		int s1,s2,s3,s4,s5;
		
		Scanner s = new Scanner(System.in);
	System.out.println("sub mark");	
		s1= s.nextInt();
		s2= s.nextInt();
		s3= s.nextInt();
		s4= s.nextInt();
		s5= s.nextInt();
		
		int sum = s1+s2+s3+s4+s5;
		System.out.println("sum of sub"+sum);
		int percentage = (sum*100)/500;
		System.out.println("percentage"+percentage);
		
		

	}

}
