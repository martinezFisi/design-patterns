/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.context;

import com.unmsm.states.HasQuarterState;
import com.unmsm.states.NoQuarterState;
import com.unmsm.states.OutSoldState;
import com.unmsm.states.SoldState;
import com.unmsm.states.State;
import com.unmsm.states.WinnerState;

/**
 *
 * @author USER
 */
public class GumballMachine {

    //States
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private OutSoldState outSoldState;
    private WinnerState winnerState;

    //Current State
    private State currentState;

    //Gumballs count
    private int gumballsCount;

    public GumballMachine(int gumballsCount) {

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        outSoldState = new OutSoldState(this);
        winnerState = new WinnerState(this);

        currentState = outSoldState;

        if (gumballsCount > 0) {
            this.gumballsCount = gumballsCount;
            currentState = noQuarterState;
        }

    }

    public void insertsQuarter() {
        currentState.insertsQuarter();
    }

    public void ejectsQuarter() {
        currentState.ejectsQuarter();
    }

    public void turnsTrunk() {
        currentState.turnsTrunk();
        currentState.dispenseGumball();
    }

    public void releaseGumball() {

        if (getGumballsCount() > 0) {
            System.out.println("A gumball comes rolling out the slot...");
            setGumballsCount(getGumballsCount() - 1);
        }

    }
    
    public void refill(int count){
        currentState.refill(count);
    }

    //setter
    /**
     * @param currentState the currentState to set
     */
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    /**
     * @param gumballsCount the gumballsCount to set
     */
    public void setGumballsCount(int gumballsCount) {
        this.gumballsCount = gumballsCount;
    }

    //getters
    /**
     * @return the noQuarterState
     */
    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    /**
     * @return the hasQuarterState
     */
    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    /**
     * @return the soldState
     */
    public SoldState getSoldState() {
        return soldState;
    }

    /**
     * @return the outSoldState
     */
    public OutSoldState getOutSoldState() {
        return outSoldState;
    }

    /**
     * @return the winnerState
     */
    public WinnerState getWinnerState() {
        return winnerState;
    }

    /**
     * @return the gumballsCount
     */
    public int getGumballsCount() {
        return gumballsCount;
    }

    //toString
    @Override
    public String toString() {
        return "GumballMachine{" + "currentState=" + currentState.getClass().getSimpleName() + ", gumballsCount=" + getGumballsCount() + '}';
    }

}
