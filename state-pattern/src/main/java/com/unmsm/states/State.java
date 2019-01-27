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
public abstract class State {

    //Context
    protected GumballMachine gumballMachine;
    
    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public abstract void insertsQuarter();
    
    public abstract void ejectsQuarter();
    
    public abstract void turnsTrunk();
    
    public abstract void dispenseGumball();
    
    public void refill(int count) {
        System.out.println("Gumball Machine has already gumballs");
    }
    
}
