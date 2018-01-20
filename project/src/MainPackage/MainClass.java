package MainPackage;

import java.util.Scanner;

import projectDaos.DaoClass;

public class MainClass {
	public static void main(String ar[]) {
		DaoClass dao=new DaoClass();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do {
			System.out.println("enter your choice:");
			System.out.println("\n\n1.add employee\n2.display details\n3.display departments\n4.remove employee\n5.exit");
			System.out.println();
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter name:");
				String n=sc.next();
				System.out.println("enter work experience:");
				int exp=sc.nextInt();
				System.out.println("enter department:\n\n1.HR\n2.Management\n3.Technical");
				int ch1=sc.nextInt();
				String d="";
				switch(ch1) {
				case 1:
					d="HR";
					break;
				case 2:
					d="Management";
					break;
				case 3:
					d="Technical";
					break;
				default:
					System.out.println("invalid choice.");
				}
				dao.addEmp(n, exp, d);
				break;
			case 2:
				dao.displayDetails();
				break;
			case 3:
				dao.departmentDetails();
				break;
			case 4:
				System.out.println("enter employee id to be removed");
				int eid=sc.nextInt();
				dao.removeEmp(eid);
				break;
			case 5:
				flag=false;
				break;
			default:
				System.out.println("invalid choice.");
			}
		}while(flag);
	sc.close();
	}
}
