package com.brillio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brillio.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	Product findByIdAndModel(int id,String model);

}
