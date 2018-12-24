/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.command;

import com.unmsm.receiver.TV;

/**
 *
 * @author USER
 */
public class TvOnCommand implements Command{

    private TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.on();
        tv.setVolume(10);
        tv.setInputChannel(30);
    }
    
}
