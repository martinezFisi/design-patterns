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
public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) throws NullPointerException{
        if(o == null){
            throw new NullPointerException();
        } 
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(NotificationInfo ni) {
        for (Observer observer : observers) {
            observer.update(this, ni);
        }
    }
}
