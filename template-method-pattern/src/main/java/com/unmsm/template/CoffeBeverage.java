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
public class CoffeBeverage extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Brew the coffee grinds");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }
    
}
