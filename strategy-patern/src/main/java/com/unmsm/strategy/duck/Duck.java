/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.strategy.duck;

import com.unmsm.strategy.duck.behavior.fly.FlyBehavior;
import com.unmsm.strategy.duck.behavior.quack.QuackBehavior;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    
    public void swim(){
        System.out.println("Swimming...");
    }
    
    public void performFly(){
        if(flyBehavior == null){
            System.out.println("It has not assigned flight functionality");
        } else {
            flyBehavior.fly();
        }
    }
    
    public void performQuack(){
        if(quackBehavior == null){
            System.out.println("It has not assigned quack functionality");
        } else {
            quackBehavior.quack();
        }
    }
    
    public abstract void display();
}
