package hr.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hr.bean.UserDetails;

public class MainClass {
	public static void main(String[] args) {
		UserDetails d=new UserDetails();
		d.setUsername("raja");
		d.setId(1210715223);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.saveOrUpdate(d);
		ses.getTransaction().commit();

	}

}
