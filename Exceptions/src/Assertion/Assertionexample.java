package Assertion;

import java.util.Scanner;

public class Assertionexample {
	public static void main(String ar[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter subject 1 marks");
			int m1=sc.nextInt();
			assert (m1>-1&&m1<101); throw new AssertionError();
		}
		catch(AssertionError e) {
			
		}
	}
}
