package UserExceptions;

import java.util.Scanner;

public class MainClass {
	public static void main(String sa[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter subject 1 marks");
			int m1=sc.nextInt();
			if(m1<0||m1>100) {
				throw new UserDefinedException();
			}
			else {
				System.out.println("the marks are:"+m1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
