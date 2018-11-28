/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.factory;

import com.unmsm.bean.NewYorkStylePizzaChesse;
import com.unmsm.bean.Pizza;

/**
 *
 * @author USER
 */
public class NewYorkPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        
        switch(type){
            case "chesse":
                return new NewYorkStylePizzaChesse();
            default:
                return null;
        }
        
    }
    
}
