/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.observer.subject;

/**
 *
 * @author USER
 */
public class NotificationInfo {
    
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "NotificationInfo{" + "temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + '}';
    }
    
    
    
}
