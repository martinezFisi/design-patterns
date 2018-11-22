/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.strategy.duck.app;

import com.unmsm.strategy.duck.DecoyDuck;
import com.unmsm.strategy.duck.MallardDuck;
import com.unmsm.strategy.duck.RedheadDuck;
import com.unmsm.strategy.duck.RubberDuck;
import com.unmsm.strategy.duck.behavior.fly.FlyNoWay;
import com.unmsm.strategy.duck.behavior.fly.FlyWithWings;
import com.unmsm.strategy.duck.behavior.quack.MuteQuack;
import com.unmsm.strategy.duck.behavior.quack.Quack;
import com.unmsm.strategy.duck.behavior.quack.Squeak;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class App {
    public static void main(String[] args) {
        //Ducks
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        
        //Quack Behaviors
        Quack quack = new Quack();
        Squeak squeack = new Squeak();
        MuteQuack muteQuack = new MuteQuack();
        
        //Fly Behaviors
        FlyWithWings flyWithWings = new FlyWithWings();
        FlyNoWay flyNoWay = new FlyNoWay();
        
        //Set behaviors at runtime
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(flyNoWay);
        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(flyWithWings);
        mallardDuck.performFly();
    }
}
