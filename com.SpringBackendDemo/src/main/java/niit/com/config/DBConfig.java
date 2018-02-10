package niit.com.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.h2.Driver;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import niit.com.dao.CategoryDAO;
import niit.com.dao.CategoryDAOImpl;
import niit.com.dao.ProductDAO;
import niit.com.dao.ProductDAOImpl;
import niit.com.dao.SupplierDAO;
import niit.com.dao.SupplierDAOImpl;
import niit.com.model.Category;
import niit.com.model.Product;
import niit.com.model.Supplier;

@Configuration
@EnableTransactionManagement
public class DBConfig {
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("data source obj created");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory() {
		Properties hibernateProp=new Properties();
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		hibernateProp.put("hibernate.hbm2ddl.auto","update");
		hibernateProp.put("hibernate.show_sql", "true");
		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getH2DataSource());
		factory.addProperties(hibernateProp);
		factory.addAnnotatedClass(Category.class);
		factory.addAnnotatedClass(Supplier.class);
		factory.addAnnotatedClass(Product.class);
		SessionFactory sessionFactory=factory.buildSessionFactory();
		System.out.println("SessionFactory created.");
		return sessionFactory;
	}
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO() {
		return new CategoryDAOImpl();
	}
	
	@Bean(name="supplierDAO")
	public SupplierDAO getSupplierDAO() {
		return new SupplierDAOImpl();
	}
	
	@Bean(name="productDAO")
	public ProductDAO getProductDAO() {
		return new ProductDAOImpl();
	}
	
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
}
