package com.net.shubh.Springboot.service;

import com.net.shubh.Springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
