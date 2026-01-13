package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ProductNotFoundException;
import com.example.demo.models.Product;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new Product(nextId++, "Produit 1", 19.99));
        products.add(new Product(nextId++, "Produit 2", 29.99));
    }
    public List<Product> getAllProducts() {
        return products;
    }
    public Product getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(id));
    }
    public Product createProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }
    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = getProductById(id);
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        return product;
    }
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        products.remove(product);
    }
}
