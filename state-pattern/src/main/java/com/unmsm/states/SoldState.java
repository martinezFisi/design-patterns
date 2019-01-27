/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.states;

import com.unmsm.context.GumballMachine;

/**
 *
 * @author USER
 */
public class SoldState extends State{

    public SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertsQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnsTrunk() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispenseGumball() {
        gumballMachine.releaseGumball();
        
        if(gumballMachine.getGumballsCount() > 0){
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setCurrentState(gumballMachine.getOutSoldState());
        }
        
    }
    
}
