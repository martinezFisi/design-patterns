/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm;

import com.unmsm.component.Espresso;
import com.unmsm.decorator.Milk;
import com.unmsm.decorator.Mocha;
import com.unmsm.decorator.Whip;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class App {
    public static void main(String[] args) {
        //Component
        Espresso espresso = new Espresso();
        //Decorator 1
        Milk milk = new Milk(espresso);
        //Decorator 2
        Mocha mocha = new Mocha(milk);
        //Decorator 3
        Whip whip = new Whip(mocha);
        //Print
        System.out.println("Description: " + whip.getDescription());
        System.out.println("Cost: " + whip.cost());
    }
}