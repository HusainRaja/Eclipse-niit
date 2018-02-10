package niit.com.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import niit.com.dao.CategoryDAO;
import niit.com.model.Category;

public class CategoryDAOTest {
	
	static CategoryDAO categoryDAO;
	@BeforeClass
	public static void preExecution() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("niit.com");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Ignore
	@Test
	public void addCategoryTest() {
		Category category=new Category();
		category.setCategoryName("testing");
		category.setCategoryDesc("testing the tester");
		assertTrue("Problem in adding category", categoryDAO.addCategory(category));
	}
	
	@Ignore
	@Test
	public void updateCategoryTest() {
		Category category=categoryDAO.getCategory(2);
		category.setCategoryName("new nameeeeee!");
		assertTrue("Problem in updating category", categoryDAO.updateCategory(category));
	}
	
	@Ignore
	@Test
	public void deleteCategoryTest() {
		Category category=categoryDAO.getCategory(2);
		assertTrue("Problem in deletion of category", categoryDAO.deleteCategory(category));
	}
	
	@Test
	public void listCategoriesTest() {
		List<Category> list =categoryDAO.listCategories();
		for(Category category:list) {
			System.out.println(category.getCategoryId()+"\t"+category.getCategoryName()+"\t\t\t"+category.getCategoryDesc());
		}
		assertNotNull("problem in retreiving",list);
	}
	
}
