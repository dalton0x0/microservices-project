package com.example.demo.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Produit avec l'id " + id + " introuvable");
    }
}
