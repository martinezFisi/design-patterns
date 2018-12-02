/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.factory.ingredient;

import com.unmsm.ingredient.chesse.Chesse;
import com.unmsm.ingredient.chesse.MozzarellaChesse;
import com.unmsm.ingredient.dough.Dough;
import com.unmsm.ingredient.dough.ThickCrustDough;
import com.unmsm.ingredient.pepperoni.ItallianPepperoni;
import com.unmsm.ingredient.pepperoni.Pepperoni;
import com.unmsm.ingredient.sauce.MarinaraSauce;
import com.unmsm.ingredient.sauce.Sauce;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Chesse createChesse() {
        return new MozzarellaChesse();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ItallianPepperoni();
    }

}
