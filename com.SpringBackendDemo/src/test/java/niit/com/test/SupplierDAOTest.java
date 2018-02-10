package niit.com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.com.dao.SupplierDAO;
import niit.com.model.Supplier;

public class SupplierDAOTest {
	
	static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void preExecution() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("niit.com");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
	
	@Ignore
	@Test
	public void addSupplierTest() {
		Supplier supplier=new Supplier();
		supplier.setSupplierName("sakshi");
		supplier.setSupplierAddr("vizag");
		assertTrue("Error in Adding Supplier",supplierDAO.addSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void updateSupplierTest() {
		Supplier supplier=supplierDAO.getSupplier(5);
		supplier.setSupplierName("Husain");
		assertTrue("Error in Updating Supplier",supplierDAO.updateSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void deleteSupplierTest() {
		Supplier supplier=supplierDAO.getSupplier(6);
		assertTrue("Error in deleting supplier",supplierDAO.deleteSupplier(supplier));
	}
	
	@Test
	public void listSuppliersTest() {
		assertNotNull("Error in listing all suppliers",supplierDAO.listSuppliers());
	}
}
