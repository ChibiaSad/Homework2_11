package com.example.homework2_11.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
//@Configuration
@SessionScope
public class ShoppingCart {
    private final List<Integer> products = new ArrayList<>();

    public List<Integer> getProducts() {
        return products;
    }

//    @Bean
//    public ShoppingCart cart(){
//        return new ShoppingCart();
//    }
}


