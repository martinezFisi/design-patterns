/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.app;

import com.unmsm.factory.ChicagoPizzaStore;
import com.unmsm.factory.NewYorkPizzaStore;

/**
 *
 * @author USER
 */
public class App {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        
        chicagoPizzaStore.orderPizza("chesse");
    }
}
