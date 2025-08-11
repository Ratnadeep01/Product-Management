package com.example.ProductAPI.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.ProductAPI.models.Products;
import com.example.ProductAPI.services.ProductServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class ProductControllers {

    @Autowired
    ProductServices productServices;

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Product Store";
    }

    @GetMapping("/products")
    public List<Products> getProduct() {
        return productServices.getProducts();
    }

    @GetMapping("/products/{id}")
    public Products getProductById(@PathVariable int id) {
        return productServices.getProductById(id);  
    }

    @PostMapping("/products")
    public String postMethodName(@RequestBody Products prod) {
         return productServices.addProducts(prod);
    }

    @PutMapping("/products")
    public String putMethodName(@RequestBody Products prod) {
        return productServices.updateProduct(prod);
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productServices.deleteProduct(id);
    }

}
