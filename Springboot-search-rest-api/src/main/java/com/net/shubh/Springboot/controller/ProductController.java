package com.net.shubh.Springboot.controller;

import com.net.shubh.Springboot.entity.Product;
import com.net.shubh.Springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // url http://localhost:8080/api/v1/products/search?query=laptop
    //Search api
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProduct(query));
    }

    @PostMapping
    public Product createProduct (@RequestBody Product product){
        return productService.createProduct(product);
    }
}

/*
{
    "sku" : "ABC",
    "name" : "Kwyboard",
    "description" : "Keyboard description",
    "active" : true,
    "imageUrl" : "Keyboard.png"
}
 */