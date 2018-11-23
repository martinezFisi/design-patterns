/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.observer.subject;

import com.unmsm.observer.observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class WeatherData extends Subject{

    private Float temperature;
    private Float humidity;
    private Float pressure;

    private final NotificationInfo notificationInfo = new NotificationInfo();
    
    /**
     * @return the temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     * @return the humidity
     */
    public Float getHumidity() {
        return humidity;
    }

    /**
     * @return the pressure
     */
    public Float getPressure() {
        return pressure;
    }
    
    public void measurementsChanged(Float temperature, Float humidity, Float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        
        notificationInfo.setTemperature(temperature);
        notificationInfo.setHumidity(humidity);
        notificationInfo.setPressure(pressure);
        
        notifyObservers(notificationInfo);
    }
    
}
