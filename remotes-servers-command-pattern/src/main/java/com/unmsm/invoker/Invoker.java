/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.invoker;

import com.unmsm.command.Command;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class Invoker {
    private Command command;

    public Invoker() {
    }
    
    public Invoker(Command command) {
        this.command = command;
    }
    
    public void run(){
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    
}
