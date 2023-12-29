package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.cofig.SpringConfig;
import com.coforge.dao.ProductDao;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import com.coforge.service.ProductService;

public class ProductMain_WithService {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		ProductService service = ctx.getBean(ProductService.class);
		Product p[] = new Product[3];
		try {

			p[0] = new Product(10001, "biscuit", 50);
			p[1] = new Product(10002, "shirt", 2000);
			p[2] = new Product(10003, "pant", 2100);

			System.out.println("add operation \n");
			service.addProduct(p[0]);
			service.addProduct(p[1]);
			service.addProduct(p[2]);
			
			
		} catch (ProductException e) {
			System.err.println(e.getMessage());
		}
	}
}
