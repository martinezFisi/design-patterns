/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.client;

import com.unmsm.adaptee.WildTurkey;
import com.unmsm.adapter.TurkeyToDuckAdapter;
import com.unmsm.target.Duck;
import com.unmsm.target.MallardDuck;

/**
 *
 * @author USER
 */
public class DuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        //Adaptee
        WildTurkey wildTurkey = new WildTurkey();
        //Adapter
        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(wildTurkey);
        
        //Test duck
        System.out.println("The duck says...");
        testDuck(mallardDuck);
       
        //Test turkey
        System.out.println("\nThe turkey says...");
        testDuck(turkeyToDuckAdapter);
        
    }
    
    //Client, just wait for duck interfaces
    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    
}
