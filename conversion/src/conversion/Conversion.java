package conversion;

import java.util.Scanner;

public class Conversion {
	int count=1;
	String s1[][]=new String [5][3];
	String fin[]=new String[20];
	String buffer[]=new String [20];
	int head=0,tail=1;
	String output[][]=new String[20][2];
	int size;
	void enterDelta() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of symbols");
		size=sc.nextInt();
		String str;
		for(int i=0;i<size;i++) {
			System.out.println("enter the symbol and its transition on 0 & 1");
			for(int j=0;j<3;j++) {
				str=sc.next();
				if(str!="-") {
					s1[i][j]=str;
				}
				else {
					s1[i][j]="";
				}
			}
		}
		sc.close();
	}
	void removeDashes() {
		for(int i=0;i<size;i++) {
			for(int j=01;j<3;j++) {
				if(s1[i][j]=="-") {
					s1[i][j]=new String();
					s1[i][j]="";
				}
			}
		}
	}
	void display() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<3;j++) {
				show(s1[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	void show(String s) {
		int len=s.length();
		for(int i=0;i<len;i++) {
			System.out.print("q"+s.charAt(i));
		}
	}
}
