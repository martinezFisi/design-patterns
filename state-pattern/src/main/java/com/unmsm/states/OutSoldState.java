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
public class OutSoldState extends State {

    public OutSoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertsQuarter() {
        System.out.println("Error, Gumball Machine has not gumballs");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("Error, Gumball Machine has not gumballs");
    }

    @Override
    public void turnsTrunk() {
        System.out.println("Error, Gumball Machine has not gumballs");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("Error, Gumball Machine has not gumballs");
    }

    @Override
    public void refill(int count) {
        if (count > 0) {
            System.out.println("Filling Gumball Machine...");
            gumballMachine.setGumballsCount(count);
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        }
    }
}
