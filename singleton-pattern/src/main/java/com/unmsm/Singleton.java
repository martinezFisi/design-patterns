/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm;

/**
 *
 * @author USER
 */
public class Singleton {
    private volatile static Singleton singleton;
    private final String connection = "localhost:3306/bd";
    
    private Singleton(){};
    
    //thread safe
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    
    public String getConnection(){
        return connection;
    }
    
}
