package com.example.homework2_11.service;

import com.example.homework2_11.entity.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final ShoppingCart shoppingCart;

    public StoreService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

//    public StoreService(@Qualifier("cart") ShoppingCart shoppingCart) {
//        this.shoppingCart = shoppingCart;
//    }

    public void addOrder(List<Integer> products) {
        shoppingCart.getProducts().addAll(products);
    }

    public List<Integer> getOrder() {
        return shoppingCart.getProducts();
    }
}
