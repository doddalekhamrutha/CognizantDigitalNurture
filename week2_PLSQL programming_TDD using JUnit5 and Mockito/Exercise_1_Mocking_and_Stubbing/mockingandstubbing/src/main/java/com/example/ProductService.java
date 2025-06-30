package com.example;

public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public String getProductName(String id) {
        Product p = repository.findById(id);
        return (p != null) ? p.getName() : null;
    }
}
