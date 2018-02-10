package niit.com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.com.dao.ProductDAO;
import niit.com.model.Product;

public class ProductDAOTest {
	static ProductDAO productDAO;
	
	@BeforeClass
	public static void preExecution() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("niit.com");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	
	@Ignore
	@Test
	public void addProductTest() {
		Product product=new Product();
		product.setPrice(2000);
		product.setProductDesc("cover");
		product.setCategoryId(1);
		product.setProductName("spigen");
		product.setStock(5);
		product.setSupplierId(1);
		assertTrue("Error in adding product",productDAO.addProduct(product));
	}
	
	@Ignore
	@Test
	public void updateProductTest() {
		Product product=productDAO.getProduct(7);
		product.setCategoryId(2);
		assertTrue("Error in updating",productDAO.updateProduct(product));
	}
	
	@Ignore
	@Test
	public void deleteProductTest() {
		Product product=productDAO.getProduct(7);
		assertTrue("Error in deleting",productDAO.deleteProduct(product));
	}
	
	@Test
	public void listProductsTest() {
		assertNotNull("Error in listing products",productDAO.listProducts());
	}
}
