package com.example.homework2_11.service;

import com.example.homework2_11.component.ShoppingCart;
import com.example.homework2_11.entity.Item;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Map<Integer, Item> catalog = new HashMap<>();

    private final ShoppingCart shoppingCart;
    public StoreService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @PostConstruct
    public void init(){
        catalog.put(1, new Item(1, "Apple", 50));
        catalog.put(2, new Item(2, "Pear", 69));
        catalog.put(3, new Item(3, "Cucumber", 30));
        catalog.put(4, new Item(4, "Onion", 25));
        catalog.put(5, new Item(5, "Milk", 100));
    }

    public void addOrder(List<Integer> ids) {
        shoppingCart.addProducts(ids.stream()
                .map(catalog::get)
                .collect(Collectors.toList()));
    }

    public List<Item> getOrder() {
        return shoppingCart.getProducts();
    }
}
