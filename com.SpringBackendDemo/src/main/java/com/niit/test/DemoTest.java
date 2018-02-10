package com.niit.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.com.dao.CategoryDAO;
import niit.com.model.Category;
public class DemoTest {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("niit.com");
		context.refresh();
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		Category category=new Category();
		category.setCategoryDesc("p");
		category.setCategoryName("face");
		categoryDAO.addCategory(category);
	}
}
