package equivalence;

import java.util.Scanner;

 public class Equivalence {
	/*static void printEach(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if(s!="-") {
				System.out.print("q"+s.charAt(i));
			}
			else {
				System.out.print(s);
			}
		}			
	}*/
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1[][]=new String [6][3];
		System.out.println("enter the number of symbols");
		int n1=sc.nextInt();
		System.out.println("enter the first delta table");
		for(int i=0;i<n1;i++) {
			System.out.println("enter symbol followed by transition by 0 and 1");
			for(int j=0;j<3;j++) {
				s1[i][j]=sc.next();
			}
		}
		/*for(int i=0;i<n1;i++) {
			//System.out.println("enter symbol followed by transition by 0 and 1");
			for(int j=0;j<3;j++) {
				//printEach(s1[i][j]);
				System.out.print(s1[i][j]+"\t");
			}
			System.out.println();
		}*/
		sc.close();
		
	}
}
