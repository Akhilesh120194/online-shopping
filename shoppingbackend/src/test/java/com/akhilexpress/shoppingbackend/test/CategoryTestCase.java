package com.akhilexpress.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akhilexpress.shoppingbackend.dao.CategoryDAO;
import com.akhilexpress.shoppingbackend.dto.Category;

/**
 * Unit test for simple App.
 */
public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.akhilexpress.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	
	}
	
	@Test
	public void testAddCategory() {
		
	//	category = new Category();
	
		category=new Category();
	
			category.setName("Desktop");
			category.setDescription("This is some description for Desktop!");
			category.setImageURL("CAT_106.png");
		//	categoryDAO.addcategory(category);
			
			
			assertEquals("Successfully added a category inside the table!",true,categoryDAO.addcategory(category));
				
		
		
		
		
	}
}