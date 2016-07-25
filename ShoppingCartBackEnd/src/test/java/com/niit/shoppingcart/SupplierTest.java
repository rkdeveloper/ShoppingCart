package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {
	
public static void main(String[] args){
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.scan("com.niit.shoppingcart");
	
	context.refresh();
	
	SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	Supplier supplier = (Supplier) context.getBean("supplier");
	
	supplier.setId("CG120");
	supplier.setName("CGname120");
	supplier.setAddress("Chennai");


	supplierDAO.saveOrUpdate(supplier);
	/*supplierDAO.delete("CG120");*/
}
}
