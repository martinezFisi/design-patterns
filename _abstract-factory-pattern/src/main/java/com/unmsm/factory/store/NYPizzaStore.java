/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.factory.store;

import com.unmsm.factory.ingredient.NYPizzaIngredientFactory;
import com.unmsm.product.ChessePizza;
import com.unmsm.product.PineapplePizza;
import com.unmsm.product.Pizza;

/**
 *
 * @author USER
 */
public class NYPizzaStore extends PizzaStore{

    private final NYPizzaIngredientFactory nYPizzaIngredientFactory = new NYPizzaIngredientFactory();
    
    @Override
    public Pizza createPizza(String type) {
        switch(type){
            case "chesse":
                return new ChessePizza(nYPizzaIngredientFactory);
            case "pineapple":
                return new PineapplePizza(nYPizzaIngredientFactory);
            default:
                return null;
        }
    }
    
}
