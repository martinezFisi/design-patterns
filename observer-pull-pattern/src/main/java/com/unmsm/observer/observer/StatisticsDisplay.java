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
public class StatisticsDisplay extends DisplayElement implements Observer{

    @Override
    public void display() {
        System.out.println("StatisticsDisplay**************");
        System.out.println("Temperature Average: " + notificationInfo.getTemperature());
        System.out.println("Humidity Average: " + notificationInfo.getHumidity());
        System.out.println("Pressure Average: " + notificationInfo.getPressure());
        System.out.println("");
    }

    @Override
    public void update(Subject s, NotificationInfo ni) {
        notificationInfo = ni;
    }

    
    
}
