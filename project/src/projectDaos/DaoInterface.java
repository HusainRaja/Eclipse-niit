package projectDaos;

import projectBeans.Employee;

public interface DaoInterface {
	void addEmp(String name,int exp,String department);
	void assignData();
	void displayDetails();
	void departmentDetails();
	void removeEmp(int eid);
	Employee emp[]=new Employee[10];
}
