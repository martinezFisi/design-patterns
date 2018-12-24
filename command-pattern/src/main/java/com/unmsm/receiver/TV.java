/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.receiver;

/**
 *
 * @author USER
 */
public class TV {
    
    public void on(){
        System.out.println("TV on");
    }
    
    public void off(){
        System.out.println("TV off");
    }
    
    public void setInputChannel(int channel){
        System.out.println("Set channel to "+channel);
    }
    
    public void setVolume(int vol){
        System.out.println("Set volume to "+vol);
    }
    
}
