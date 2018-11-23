/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.observer.app;

import com.unmsm.observer.observer.CurrentConditionsDisplay;
import com.unmsm.observer.observer.StatisticsDisplay;
import com.unmsm.observer.subject.WeatherData;

/**
 *
 * @author USER
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Subject
        WeatherData wd = new WeatherData();
        //Observers
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay();
        StatisticsDisplay statistics = new StatisticsDisplay();
        //Register observers
        wd.registerObserver(currentConditions);
        wd.registerObserver(statistics);
        //New conditions
        wd.measurementsChanged(27F, 90F, 40F);
        //Display
        currentConditions.display();
        statistics.display();
    }
    
}
