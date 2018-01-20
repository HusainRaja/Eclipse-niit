package projectDaos;

import projectBeans.Employee;

public class DaoClass implements DaoInterface{
    
	static int count=110;
	static int c=0;
	int exp;
	public void addEmp(String name, int exp, String department) {
		if(c<10) {
			emp[c]=new Employee();
			emp[c].setName(name);
			this.exp=exp;
			emp[c].setExp(exp);
			emp[c].setDepartment(department);
			assignData();
		}
		else {
			System.out.println("exceeds maximum employee number!!");
		}
	}

	
	public void assignData() {
		count++;
		emp[c].setEid(count);
		if(exp<=2) {
			emp[c].setPost("group member");
			emp[c].setSalary(25000);
		}
		else if(exp<=5) {
			emp[c].setPost("group leader");
			emp[c].setSalary(40000);
		}
		else {
			emp[c].setPost("team leader");
			emp[c].setSalary(60000);
		}
		c++;
		//System.out.println("COUNT="+count+" C="+c);
	}

	
	public void displayDetails() {
		if(c==0) {
			System.out.println("no employees to display");
		}
		else {
			for(int i=0;i<c;i++) {
				System.out.println(emp[i].getName());
				System.out.println("employee id:"+emp[i].getEid()+"\nname:"+emp[i].getName());
				System.out.println("salary:"+emp[i].getSalary()+"\ndepartment:"+emp[i].getDepartment());
				System.out.println("post:"+emp[i].getPost()+"\nexperience:"+emp[i].getExp());
				System.out.println();
			}
		}
	}

	
	public void departmentDetails() {
		String dep[]={"HR","Management","Technical"};
		for(int i=0;i<3;i++) {
			System.out.println("department:"+dep[i]);
			for(int j=0;j<c;j++) {
				if(emp[j].getDepartment()==dep[i]) {
					System.out.println(emp[j].getName());
				}
			}
			System.out.println();
		}
	}

	
	public void removeEmp(int eid) {
		if(c==0) {
			System.out.println("removal not possible");
		}
		else {
			int i,index=0;
			for(i=0;i<c;i++) {
				if(eid==emp[i].getEid()) {
					index=i;
					break;
				}
			}
			if(i==c) {
				System.out.println("employee id not found");
			}
			else {
				for(i=index;i<c-1;i++) {
					emp[i]=emp[i+1];
				}
				c--;
			}
		}
	}
	
}
