/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.factory.ingredient;

import com.unmsm.ingredient.chesse.Chesse;
import com.unmsm.ingredient.chesse.ReggianoChesse;
import com.unmsm.ingredient.dough.Dough;
import com.unmsm.ingredient.dough.ThinCrustDough;
import com.unmsm.ingredient.pepperoni.Pepperoni;
import com.unmsm.ingredient.pepperoni.PeruvianPepperoni;
import com.unmsm.ingredient.sauce.PlumTomatoSauce;
import com.unmsm.ingredient.sauce.Sauce;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Chesse createChesse() {
        return new ReggianoChesse();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PeruvianPepperoni();
    }

}
