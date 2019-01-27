/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.app;

import com.unmsm.context.GumballMachine;

/**
 *
 * @author USER
 */
public class App {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        System.out.println(gumballMachine);
        System.out.println("");

        while (gumballMachine.getGumballsCount() > 0) {
            gumballMachine.insertsQuarter();
            gumballMachine.turnsTrunk();
            System.out.println("");
        }

        System.out.println("");
        System.out.println(gumballMachine);

        System.out.println("");
        gumballMachine.refill(10);
        
        System.out.println("");
        System.out.println(gumballMachine);
    }
}
