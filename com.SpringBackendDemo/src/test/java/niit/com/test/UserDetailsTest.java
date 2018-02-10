package niit.com.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.com.dao.UserDetailsDAO;
import niit.com.model.UserDetails;

public class UserDetailsTest {
	
	static UserDetailsDAO userDetailsDAO;
	
	@BeforeClass
	public static void preExecution() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("niit.com");
		context.refresh();
		userDetailsDAO=(UserDetailsDAO)context.getBean("userDetailsDAO");
	}
	
	@Ignore
	@Test
	public void addUserTest() {
		UserDetails userDetails=new UserDetails();
		userDetails.setAddress("vizag");
		userDetails.setCustomerName("husain");
		userDetails.setEmailId("husain1997@gmail.com");
		userDetails.setEnabled(false);
		userDetails.setPassword("password");
		userDetails.setRole("ADMIN");
		userDetails.setUsername("Husain Raja");
		assertTrue("Error in ading a user", userDetailsDAO.addUser(userDetails));
	}
	
	@Ignore
	@Test 
	public void updateUserTest() {
		UserDetails userDetails=userDetailsDAO.getUser("Akil Raja");
		userDetails.setPassword("password123");
		assertTrue("Error in updating user details",userDetailsDAO.updateUser(userDetails));
	}
	
	@Ignore
	@Test
	public void approveUserTest() {
		UserDetails userDetails=userDetailsDAO.getUser("Husain Raja");
		userDetails.setEnabled(true);
		assertTrue("Error in approving user",userDetailsDAO.approveUser(userDetails));
	}
	
	@Ignore
	@Test
	public void deleteUserTest() {
		UserDetails userDetails=userDetailsDAO.getUser("Akil Raja");
		assertTrue("Error in deleting user", userDetailsDAO.deleteUser(userDetails));
	}
	
	@Test
	public void listUsersTest() {
		assertNotNull("Error in listing all users",userDetailsDAO.listUsers());
	}
}
 