package com.nagmat.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagmat.springweb.entities.Product;
import com.nagmat.springweb.repos.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value="/products/",method=RequestMethod.GET)
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id){
		System.out.println("Product id=== "+repository.findById(id).get().getId());
		return repository.findById(id).get();
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@RequestBody Product product) {
		System.out.println("Product = "+product.getDescription());
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void delteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
}
