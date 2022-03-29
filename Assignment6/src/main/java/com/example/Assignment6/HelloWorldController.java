package com.example.Assignment6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Autowired
	ProductDetailsJPA cart;
	
	
	@GetMapping("/cartProducts")
	public List<ProductDetails> showAllProductsInCart() {
		return cart.findAll();
	}
	
	@GetMapping("/cartCount")
	public long cartCount() {
		return cart.count();
	}
	
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody ProductDetails product) {
		   cart.save(product);
		   return "Product Added Successfully - " + product.getProductName();
	}
	
	@PutMapping("/updateProduct/{productName}")
	public String updateProduct(@RequestBody ProductDetails product, @ PathVariable String productName) {
		for(ProductDetails p: cart.findAll()) {
			if(p.getProductName().equals(productName)) {
				cart.delete(p);
				cart.save(product);
			}
		}
		   return "Product updated Successfully - " + product.getProductName();
	}
	
	
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestBody ProductDetails product) {
		cart.delete(product);
		return "Product deleted Successfully " ;
	}
	
}	
	