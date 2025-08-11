package com.example.ProductAPI.services;

import java.util.*;

import org.springframework.stereotype.Service;
import com.example.ProductAPI.models.*;

@Service
public class ProductServices {

    List<Products> productList = new ArrayList<>();

    public ProductServices() {
        productList.add(new Products(1, "Iphone", 90000));
        productList.add(new Products(1, "Samsung", 80000));
        productList.add(new Products(3, "Motorola", 40000));
        productList.add(new Products(4, "Vivo", 60000));
    }

    public List<Products> getProducts() {
        return productList;
    }
    public Products getProductById(int id) {
        Products prod = new Products(0, "There is no product", 0);
        // return productList.stream()
        //                   .filter(product -> product.getProductId() == id)
        //                   .findFirst()
        //                   .orElse(new Products(0, "No", 00));
        for(Products product: productList) {
            if(product.getProdId() == id) {
                prod = product;
                break;
            }
        }
        return prod;
    }

    public String addProducts(Products prod) {
        productList.add(prod);
        return "Products added successfully";
    }

    public String updateProduct(Products prod) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProdId() == prod.getProdId()) {
                productList.set(i, prod);
                return "The product with id: " + prod.getProdId() + "updated";
            }
        }
        return "The product with id: " + prod.getProdId() + "not found in the list";
    }

    public String deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProdId() == id) {
                productList.remove(i);
                return "The product with id: " + id + "deleted";
            }
        }
        return "The product with id: " + id + "not found in the list";

    }
}
