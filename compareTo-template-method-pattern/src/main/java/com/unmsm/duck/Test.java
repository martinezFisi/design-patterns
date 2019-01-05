/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.duck;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args) {
        Duck ducks[] = new Duck[]{ new Duck("Jose", 20), new Duck("Jhon", 10), 
                                   new Duck("Alex", 15), };
        
        System.out.println("Before sorting:");
        displayDucks(ducks);
        
        Arrays.sort(ducks);
        
        System.out.println("\nAfter sorting:");
        displayDucks(ducks);
    }
    
    public static void displayDucks(Duck ducks[]){
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
    
}
