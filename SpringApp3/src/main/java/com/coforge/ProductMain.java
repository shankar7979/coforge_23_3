package com.coforge;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.cofig.SpringConfig;
import com.coforge.dao.ProductDao;
import com.coforge.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				 (ProductDao.class);
		
		ProductDao dao = ctx.getBean(ProductDao.class);
		Product p[]=new Product[3];

		p[0]=new Product(10001,"biscuit",50);
		p[1]=new Product(10002,"shirt",2000);
		p[2]=new Product(10003,"pant",2100);
		
		dao.addProduct(p[0]);
		dao.addProduct(p[1]);
		dao.addProduct(p[2]);
		
		Map<Long, Product> allProduct = dao.getAllProduct();
		
		for(Entry<Long, Product> p1:allProduct.entrySet())
			System.out.println(p1.getValue());
	}
}
