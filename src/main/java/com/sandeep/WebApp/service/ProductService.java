package com.sandeep.WebApp.service;

import com.sandeep.WebApp.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone", 50000),
            new Product(102, "Samsung", 40000),
            new Product(103, "Nokia" , 30000)));

    public List<Product> getProducts(){

        return products;

    }


    public Product getProductById(int prodID) {

         return products.stream()
                 .filter( p -> p.getProdID() == prodID )
                 .findFirst().orElse(new Product(100,"sand",10000));

    }

    public void addProduct(Product prod){

          System.out.println(prod);
         products.add(prod);

    }

    public void updateProduct(Product prod) {

        int idx = 0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdID()==prod.getProdID())
                idx = i;

        }

        products.set(idx,prod);

    }

    public void deleteProduct(int prodID) {

        int idx = 0;
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getProdID() ==  prodID)
                idx = i;
        }

        products.remove(idx);
    }
}


//.findFirst().get();