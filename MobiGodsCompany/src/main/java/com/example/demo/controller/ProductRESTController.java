package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Product;

import com.example.demo.respostiory.ProductRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProductRESTController {
	
	@Autowired
	private ProductRepo repo;
	
	@GetMapping("products")
	public List<Product> productpage() {
		return repo.findAll();	
		
	}
	
	@PostMapping("products")
	public Boolean insertdata(@RequestBody Product product) {
		try {
			repo.save(product);
		}catch(IllegalArgumentException  e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@DeleteMapping("products/{id}")
	public Boolean deletedata(@PathVariable("id") int id,Product product) {
		try {
			repo.deleteById(id);
		}catch(IllegalArgumentException e) {
			System.out.println("entity null,no json data");
			return false;
		}
		return true;
		
	}
	
	@PutMapping("products")
	public Boolean updatedata(@RequestBody Product product) {
		try {
			//product.setPid(id);@PathVariable("id") int id,
			repo.save(product);
		}catch(IllegalArgumentException e) {
			return false;
			
		}
		return true;
	}
	
	
	

}
