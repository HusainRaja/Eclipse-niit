package hr.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle implements InitializingBean, DisposableBean{
	private String type;
	private int height;
	public Rectangle(String type) {
		this.type=type;
	}
	public Rectangle(String type, int height) {
		this.type=type;
		this.height=height;
	}
	void draw() {
		System.out.println(type+" Rectangle with height="+height);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method for rectangle called");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called");
		
	}
}
