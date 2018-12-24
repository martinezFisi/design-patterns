/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.client;

import com.unmsm.command.GarageDoorOffCommand;
import com.unmsm.command.GarageDoorOnCommand;
import com.unmsm.command.LightOffCommand;
import com.unmsm.command.LightOnCommand;
import com.unmsm.command.StereoOffCommand;
import com.unmsm.command.StereoOnForCDCommand;
import com.unmsm.command.TvOffCommand;
import com.unmsm.command.TvOnCommand;
import com.unmsm.invoker.RemoteControl;
import com.unmsm.receiver.GarageDoor;
import com.unmsm.receiver.Light;
import com.unmsm.receiver.Stereo;
import com.unmsm.receiver.TV;

/**
 *
 * @author USER
 */
public class ClientRemoteControl {
    
    public static void main(String[] args) {
        //Receivers
        Light kitchenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        TV tv = new TV();
        Stereo stereo = new Stereo();
        //Commands
        LightOnCommand lightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffCommand = new LightOffCommand(kitchenLight);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        StereoOnForCDCommand stereoOnForCDCommand = new StereoOnForCDCommand(stereo);
        StereoOffCommand stereoOffForCDCommand = new StereoOffCommand(stereo);
        //Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOnCommand, garageDoorOffCommand);
        remoteControl.setCommand(2, tvOnCommand, tvOffCommand);
        remoteControl.setCommand(3, stereoOnForCDCommand, stereoOffForCDCommand);
        
        remoteControl.onButtonWasPushed(0);
        System.out.println("");
        remoteControl.onButtonWasPushed(2);
        System.out.println("");
        remoteControl.undoButtonWasPushed();
        
        
    }
    
}
