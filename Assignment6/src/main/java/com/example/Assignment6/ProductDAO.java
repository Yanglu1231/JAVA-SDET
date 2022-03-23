package com.example.Assignment6;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ProductDAO {

	ArrayList<ProductDetails> shoppingCart = new ArrayList<>();
	
	ProductDAO(){
		ProductDetails product = new ProductDetails();
		product.setProductName("SamSung TV");
		product.setProductPrice(1200);
		this.addProduct(product);
	}
	
	//Adding New product to cart --> CREATE 
	public void addProduct(ProductDetails product) {
		shoppingCart.add(product);
	}
	
	public ArrayList<ProductDetails> showAllProduct() {
		return shoppingCart;
	}
	
	
	public int cartCount() {
		return shoppingCart.size();
	}

	public int getTotal() {
		int total = 0;
		for(int i=0; i<shoppingCart.size();i++) {
			total += shoppingCart.get(i).getProductPrice();
		}
		return total;
	}
	
	public void updateProduct(ProductDetails product, String productName) {
		for(int i=0; i<shoppingCart.size();i++) {
			ProductDetails p = shoppingCart.get(i);
			if(p.getProductName().equals(productName)) {
				shoppingCart.set(i, product);
			}
		}
	}

	public void deleteProduct(String productName) {
		shoppingCart.removeIf(t -> t.getProductName().equals(productName));
	}
	
	
	
}
