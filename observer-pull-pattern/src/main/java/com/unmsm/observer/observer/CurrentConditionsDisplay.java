/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.observer.observer;

import com.unmsm.observer.subject.NotificationInfo;
import com.unmsm.observer.subject.Subject;

/**
 *
 * @author USER
 */
public class CurrentConditionsDisplay extends DisplayElement implements Observer{
    
    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay**************");
        System.out.println("Temperature: " + notificationInfo.getTemperature());
        System.out.println("Humidity: " + notificationInfo.getHumidity());
        System.out.println("Pressure: " + notificationInfo.getPressure());
        System.out.println("");
    }

    @Override
    public void update(Subject s, NotificationInfo ni) {
        notificationInfo = ni;
    }

   
    
}
