package com.niit.shoppingcart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {
	
public static void main(String[] args){
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.scan("com.niit.shoppingcart");
	context.refresh();
	
	CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	Category category = (Category) context.getBean("category");
	
	
	category.setId("CG120");
	category.setName("CGname120");
	category.setDescripton("CGDesc120");


	categoryDAO.saveOrUpdate(category);
}
}
