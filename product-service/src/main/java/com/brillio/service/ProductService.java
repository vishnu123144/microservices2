package com.brillio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Product;
import com.brillio.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
//	public Product findByIdAndModel()
//	{
//		Product findby=repository.findByIdAndModel(0, null);
//		if(findby!=null)
//	}

}
