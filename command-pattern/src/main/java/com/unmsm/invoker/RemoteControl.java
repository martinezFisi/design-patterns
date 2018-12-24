/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.invoker;

import com.unmsm.command.Command;
import com.unmsm.command.NoCommand;

/**
 *
 * @author USER
 */
public class RemoteControl {
    private int SLOTS_NUMBER = 4;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command noComand = new NoCommand();
    private Command undo;

    public RemoteControl() {
        onCommands = new Command[4];
        offCommands = new Command[4];
        
        for (int i = 0; i < SLOTS_NUMBER; i++) {
            onCommands[i] = noComand;
            offCommands[i] = noComand;
        }
        
        undo = noComand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undo = offCommands[slot];
    }
    
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undo = onCommands[slot];
    }
    
    public void undoButtonWasPushed(){
        undo.execute();
    }
    
}
