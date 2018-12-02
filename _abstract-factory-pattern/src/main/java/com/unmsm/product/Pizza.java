/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.product;

import com.unmsm.factory.ingredient.PizzaIngredientFactory;
import com.unmsm.ingredient.chesse.Chesse;
import com.unmsm.ingredient.dough.Dough;
import com.unmsm.ingredient.pepperoni.Pepperoni;
import com.unmsm.ingredient.sauce.Sauce;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Chesse chesse;
    protected Pepperoni pepperoni;
    protected PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = this.getClass().getSimpleName();
    }
    
    //It is possible that not all pizzas use the same ingredients
    public abstract void prepare();
    
    public void cake(){
        System.out.println("Bake for 35 minutes at 350");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box(){
        System.out.println("Place the pizza in official PizaStore box");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
