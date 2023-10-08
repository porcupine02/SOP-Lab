package com.example.lab4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cashier {
//    private int money;

    @RequestMapping(value = "/getChange/{money}", method = RequestMethod.GET)
    public Change getChange(@PathVariable int money){
        int b1000 = money/1000;
        money = money%1000;
        int b500 = money/500;
        money = money%500;
        int b100 = money/100;
        money = money%100;
        int b20 = money/20;
        money = money%20;
        int b10 = money/10;
        money = money%10;
        int b5 = money/5;
        money = money%5;
        int b1 = money/1;
//        money = money%1;

        return new Change(b1000, b500, b100, b20, b10, b5, b1);

    }
}
