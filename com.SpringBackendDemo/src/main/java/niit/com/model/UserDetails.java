package niit.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserDetails {
	
	@Id
	@GeneratedValue
	private String username;
	private String password,customerName,role,emailId,address;
	boolean enabled;//to show if should be logged in or no
}
