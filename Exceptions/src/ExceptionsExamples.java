import java.util.*;
import java.util.Scanner;

public class ExceptionsExamples {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter 1st value");
			int a=sc.nextInt();
			System.out.println("enter 2nd value");
			int b=sc.nextInt();
			System.out.println("the quotient is:"+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("the second value should'nt be 0");
		}
		catch(InputMismatchException e) {
			System.out.println("enter numbers only");
		}
	}
}
