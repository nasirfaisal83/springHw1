package com.mst.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Barista {
    private final CoffeeMachine coffeeMachine;

    @Autowired
    public Barista(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public String serve(Customer c1, String drink) {
        return "Serving " + coffeeMachine.brewCoffee(drink) + " to " + c1.getId();
    }
}
