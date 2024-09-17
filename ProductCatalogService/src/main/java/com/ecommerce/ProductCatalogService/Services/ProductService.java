package com.ecommerce.ProductCatalogService.Services;

import com.ecommerce.ProductCatalogService.Models.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product updateProduct();
    Product replaceProduct();
    Product createProduct(Product product);
    Product deleteProduct();
}
