package com.mst.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cashier {

    @PostConstruct
    public void init() {
        System.out.println("Cashier is ready to serve...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cashier is going off duty...");
    }

    public String processPayment(Customer customer, double amount) {
        return "Processed payment of $" + amount + " for customer is : " + customer.getId();
    }
}
