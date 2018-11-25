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
public abstract class CondimentDecorator extends Beverage{
    protected final Beverage beverage;
    
    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public abstract String getDescription();
    
    @Override
    public abstract float cost();
}
