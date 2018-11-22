/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.strategy.duck.behavior.fly;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Fly no way");
    }

}
