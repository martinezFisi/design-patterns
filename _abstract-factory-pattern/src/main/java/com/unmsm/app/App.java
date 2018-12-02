/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.app;

import com.unmsm.factory.store.ChicagoPizzaStore;
import com.unmsm.factory.store.NYPizzaStore;

/**
 *
 * @author USER
 */
public class App {
    public static void main(String[] args) {
        NYPizzaStore nYPizzaStore = new NYPizzaStore();
        nYPizzaStore.orderPizza("chesse");
        
        System.out.println("");
        
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("chesse");
        
        System.out.println("");
        
        nYPizzaStore.orderPizza("pineapple");
    }
}
