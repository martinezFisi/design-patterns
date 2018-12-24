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
public class Stereo {
    
    public void on(){
        System.out.println("Stereo on!");
    }
    
    public void off(){
        System.out.println("Stereo off!");
    }
    
    public void setCd(){
        System.out.println("Set Cd");
    }
    
    public void setDvd(){
        System.out.println("Set dvd");
    }
    
    public void setVolume(int vol){
        System.out.println("Set volume to "+vol);
    }
    
}
