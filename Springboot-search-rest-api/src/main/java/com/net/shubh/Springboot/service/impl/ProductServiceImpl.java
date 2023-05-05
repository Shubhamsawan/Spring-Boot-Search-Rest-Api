package com.net.shubh.Springboot.service.impl;

import com.net.shubh.Springboot.entity.Product;
import com.net.shubh.Springboot.repository.ProductRepository;
import com.net.shubh.Springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProduct(String query) {
        List<Product> product = productRepository.searchProducts(query);
        return product;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
