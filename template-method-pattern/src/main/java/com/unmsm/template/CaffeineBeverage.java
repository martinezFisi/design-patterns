/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.template;

/**
 *
 * @author USER
 */
public abstract class CaffeineBeverage {
    
    //Template method
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("Boil some water");
    }
    
    public abstract void brew();
    
    public void pourInCup(){
        System.out.println("Pour in a cup");
    }
    
    public abstract void addCondiments();
    
    //Hook
    public boolean customerWantsCondiments(){
        return true;
    }
    
}
