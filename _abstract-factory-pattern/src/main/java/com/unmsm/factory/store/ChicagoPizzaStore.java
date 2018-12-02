/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.factory.store;

import com.unmsm.factory.ingredient.ChicagoPizzaIngredientFactory;
import com.unmsm.product.ChessePizza;
import com.unmsm.product.Pizza;

/**
 *
 * @author USER
 */
public class ChicagoPizzaStore extends PizzaStore{

    private final ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = 
                                          new ChicagoPizzaIngredientFactory();
    
    @Override
    public Pizza createPizza(String type) {
        switch(type){
            case "chesse":
                return new ChessePizza(chicagoPizzaIngredientFactory);
            default:
                return null;
        }
    }
    
}
