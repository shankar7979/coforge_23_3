package com.coforge.dao;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import com.coforge.model.Product;
import lombok.Data;

@Resource
@Data
public class ProductDao {

	Map<Long, Product> productMap;

	ProductDao() {
		productMap = new HashMap<>();
	}

	public Product addProduct(Product p) {
		return productMap.put(p.getId(), p);
	}
	public Map<Long,Product> getAllProduct() {
		return productMap;
	}

}
