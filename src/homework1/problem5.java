package homework1;
import java.util.Scanner;

public class problem5 {

		
	public static void main(String[] args) {
		double x,y;
		int z, b;
	
		System.out.print("Please enter the bill amount: ");
		Scanner in = new Scanner (System.in);
		x = in.nextDouble();
		y = in.nextDouble();
		z = in.nextInt();
		b = (int) ((x+(x*y))/z);
		System.out.println("Bill per person= "+b);
	}
}
