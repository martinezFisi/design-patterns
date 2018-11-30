/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.factory.ingredient;

import com.unmsm.ingredient.chesse.Chesse;
import com.unmsm.ingredient.dough.Dough;
import com.unmsm.ingredient.sauce.Sauce;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public interface PizzaIngredientFactory {
    
    Dough createDough();
    Sauce createSauce();
    Chesse createChesse();
    
}
