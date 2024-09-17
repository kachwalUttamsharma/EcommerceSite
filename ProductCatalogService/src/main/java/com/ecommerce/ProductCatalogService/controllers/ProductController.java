package com.ecommerce.ProductCatalogService.controllers;

import com.ecommerce.ProductCatalogService.Models.Product;
import com.ecommerce.ProductCatalogService.Services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    @PostMapping
    public  Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("{id}")
    public  Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return new Product();
    }

    @PatchMapping("{id}")
    public  Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public Product deleteProductById(@PathVariable("id") Long id) {
        return new Product();
    }
}
