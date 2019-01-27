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
public class WinnerState extends State{

    public WinnerState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertsQuarter() {
        System.out.println("Wait, You won two gumballs");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("Wait, You won two gumballs");
    }

    @Override
    public void turnsTrunk() {
        System.out.println("Wait, You won two gumballs");
    }

    @Override
    public void dispenseGumball() {
        gumballMachine.releaseGumball();
        gumballMachine.releaseGumball();
        
        if(gumballMachine.getGumballsCount() > 0){
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        } else{
            gumballMachine.setCurrentState(gumballMachine.getOutSoldState());
        }
        
    }
    
}
