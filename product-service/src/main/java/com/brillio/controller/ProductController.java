package com.brillio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/product")
	public String getProduct()
	{
		return "welcome to product page";
	}

}
