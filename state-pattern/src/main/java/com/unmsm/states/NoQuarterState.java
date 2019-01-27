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
public class NoQuarterState extends State{

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }
    
    @Override
    public void insertsQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("You haven’t inserted a quarter");
    }

    @Override
    public void turnsTrunk() {
        System.out.println("You turned but there’s no quarter");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("You need to pay first");
    }
    
}
