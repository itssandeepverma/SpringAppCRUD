package com.sandeep.WebApp.controller;

import com.sandeep.WebApp.model.Product;
import com.sandeep.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();

    }

    @RequestMapping("/products/{prodID}")
    public Product getProductById(@PathVariable  int prodID){

        return service.getProductById(prodID);

    }

    @PostMapping("/products")
    public void addProduct(@RequestBody  Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){

        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteProduct(@PathVariable int prodI){
        service.deleteProduct(prodI);
    }

}
