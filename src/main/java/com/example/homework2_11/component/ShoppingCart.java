package com.example.homework2_11.component;

import com.example.homework2_11.entity.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class ShoppingCart {
    private final List<Item> products = new ArrayList<>();

    public void addProducts(List<Item> items){
        this.products.addAll(items);
    }
    public List<Item> getProducts() {
        return new ArrayList<>(products);
    }
}


