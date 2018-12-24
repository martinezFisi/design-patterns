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
public class GarageDoorOffCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
    }
    
}
