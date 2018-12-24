/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.command;

import com.unmsm.receiver.GarageDoor;

/**
 *
 * @author USER
 */
public class GarageDoorOnCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        garageDoor.lightOn();
        garageDoor.up();
        garageDoor.stop();
    }
    
}
