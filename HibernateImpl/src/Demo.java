import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Employee;

public class Demo {
	public static void main(String args[]) {
		Configuration config=new Configuration();
		
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tr=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEid(102);
		emp.setAddress("vizag");
		emp.setName("gayatri");
		emp.setSalary(1000000);
		session.saveOrUpdate(emp);
		
		tr.commit();
		
		session.close();
		System.out.println("hello");
		//sessionFactory.close();
	}
}
