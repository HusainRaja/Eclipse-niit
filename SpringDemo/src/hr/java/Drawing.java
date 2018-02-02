package hr.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
public class Drawing {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		Rectangle rect=(Rectangle)context.getBean("rectangle");
		Square sq=(Square)context.getBean("square");
		NewSquare ns=(NewSquare)context.getBean("newSquare");
		triangle.draw();
		rect.draw();
		System.out.println("\n");
		sq.draw();
		System.out.println("\n");
		ns.draw();
	}

}
