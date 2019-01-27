/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.states;

import com.unmsm.context.GumballMachine;
import java.util.Random;

/**
 *
 * @author USER
 */
public class HasQuarterState extends State{

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertsQuarter() {
        System.out.println("You can’t insert another quarter");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnsTrunk() {
        System.out.println("You turned...");
        
        int aleatorio = new Random().nextInt(10);
        
        if( gumballMachine.getGumballsCount() >= 2 && aleatorio == 0 ){
            System.out.println("Congrats, you won two gumballs!!");
            gumballMachine.setCurrentState(gumballMachine.getWinnerState());
        } else{
            gumballMachine.setCurrentState(gumballMachine.getSoldState());
        }
       
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball dispensed");
    }
    
}
