package com.example.homework2_11.service;

import com.example.homework2_11.entity.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class StoreService {
    private final ShoppingCart shoppingCart;

    public StoreService() {
        this.shoppingCart = new ShoppingCart();
    }

    public void addOrder(List<Integer> products) {
        shoppingCart.getProducts().addAll(products);
    }

    public List<Integer> getOrder() {
        return shoppingCart.getProducts();
    }
}
