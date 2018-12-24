/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.command;

import com.unmsm.receiver.Stereo;

/**
 *
 * @author USER
 */
public class StereoOffCommand implements Command{

    private Stereo stereo;
    
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.off();
    }
    
}
