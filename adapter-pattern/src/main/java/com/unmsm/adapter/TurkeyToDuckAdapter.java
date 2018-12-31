/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.adapter;

import com.unmsm.adaptee.Turkey;
import com.unmsm.target.Duck;

/**
 *
 * @author USER
 */
public class TurkeyToDuckAdapter implements Duck{

    private Turkey turkey;
    
    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    
    public void setTurkey(Turkey turkey){
        this.turkey = turkey;
    }
    
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
    
}
