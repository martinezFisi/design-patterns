/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.product;

import com.unmsm.factory.ingredient.PizzaIngredientFactory;

/**
 *
 * @author USER
 */
public class PineapplePizza extends Pizza{

    public PineapplePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing...");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
    
    @Override
    public String toString() {
        return "Pizza{" + "name=" + name + ", dough=" + dough.getName() + ", sauce=" + sauce.getName() + ", pepperoni=" + pepperoni.getName() + "}";
    }
}
