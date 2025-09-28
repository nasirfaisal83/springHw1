package com.mst.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Customer {
    private final int id;

    public Customer() {
        this.id = (int)(Math.random()*1000);
    }

    public int getId() {
        return id;
    }
}
