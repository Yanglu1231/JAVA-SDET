package com.example.Assignment6;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Autowired
	ProductDAO cart = new ProductDAO();
	
	
	@GetMapping("/cartProducts")
	public ArrayList<ProductDetails> showAllProductsInCart() {
		return cart.showAllProduct();
	}
	
	@GetMapping("/cartCount")
	public int cartCount() {
		return cart.cartCount();
	}
	
	@GetMapping("/cartTotal")
	public int cartTotal() {
		return cart.getTotal();
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody ProductDetails product) {
		   cart.addProduct(product);
		   return "Product Added Successfully - " + product.getProductName();
	}
	
	@PutMapping("/updateProduct/{productName}")
	public String updateProduct(@RequestBody ProductDetails product, @ PathVariable String productName) {
		   cart.updateProduct(product, productName);
		   return "Product updated Successfully - " + product.getProductName();
	}
	
	@DeleteMapping("/deleteProduct/{productName}")
	public String deleteProduct(@ PathVariable String productName) {
		   cart.deleteProduct(productName);
		   return "Product deleted Successfully " ;
	}
	
}	
	