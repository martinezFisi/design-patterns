/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.app;

import com.unmsm.Singleton;

/**
 *
 * @author USER
 */
public class App {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton1-Connection: "+singleton1.getConnection());
        
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2-Connection: "+singleton2.getConnection());
    }
}
