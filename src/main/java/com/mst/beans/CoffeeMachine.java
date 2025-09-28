package com.mst.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class CoffeeMachine {

    @PostConstruct
    public void init(){
        System.out.println("CoffeeMachine is ready to use...");
    }

    public String brewCoffee(String drink){
        return "☕ " + drink;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("CoffeeMachine is shutting down...");
    }
}
