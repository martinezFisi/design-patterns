/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.command;

import com.unmsm.receiver.Light;

/**
 *
 * @author USER
 */
public class LightOnCommand implements Command{

    private Light light;
    
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    
    
    
}
