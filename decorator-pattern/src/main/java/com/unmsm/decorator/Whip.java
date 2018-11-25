/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.decorator;

import com.unmsm.component.Beverage;

/**
 *
 * @author USER
 */
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        super(beverage);
        description = "Whip";
        cost = 3F;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " +description;
    }

    @Override
    public float cost() {
        return beverage.cost() + cost;
    }
    
}
