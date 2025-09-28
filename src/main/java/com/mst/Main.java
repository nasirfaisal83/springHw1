package com.mst;

import com.mst.beans.Barista;
import com.mst.beans.CoffeeMachine;
import com.mst.beans.Customer;
import com.mst.config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);

        // Prototype vs Singleton demo
        Customer c1 = ctx.getBean(Customer.class);
        Customer c2 = ctx.getBean(Customer.class);
        System.out.println("Customers are different instances? " + (c1 != c2));

        Barista barista = ctx.getBean(Barista.class);
        System.out.println(barista.serve(c1, "Espresso"));
        System.out.println(barista.serve(c2, "Latte"));

        // CoffeeMachine scope observation
        CoffeeMachine m1 = ctx.getBean(CoffeeMachine.class);
        CoffeeMachine m2 = ctx.getBean(CoffeeMachine.class);
        System.out.println("CoffeeMachine is singleton? " + (m1 == m2));


        ctx.close();
    }
}