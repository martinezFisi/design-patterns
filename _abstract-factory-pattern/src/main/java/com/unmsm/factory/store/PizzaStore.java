/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.factory.store;

import com.unmsm.product.Pizza;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public abstract class PizzaStore {
    
    public abstract Pizza createPizza(String type);
    
    public void orderPizza(String type){
        System.out.println("Order received");
        Pizza pizza = createPizza(type);
        pizza.prepare();
        System.out.println(pizza.toString());
        pizza.cake();
        pizza.cut();
        System.out.println("Order attended");
    }
    
}
