package com.example.homework2_11.controller;

import com.example.homework2_11.entity.Item;
import com.example.homework2_11.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String addOrder(@RequestParam List<Integer> ids){
        storeService.addOrder(ids);
        return "Products added";
    }

    @GetMapping("/get")
    public List<Item> getOrder(){
        return storeService.getOrder();
    }
}
