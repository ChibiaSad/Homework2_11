package com.example.homework2_11.controller;

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
    public String addOrder(@RequestParam Integer... productID){
        storeService.addOrder(List.of(productID));
        return "Products added";
    }

    @GetMapping("/get")
    public List<Integer> getOrder(){
        return storeService.getOrder();
    }
}
