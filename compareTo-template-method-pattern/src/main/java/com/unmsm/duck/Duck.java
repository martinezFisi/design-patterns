/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.duck;

/**
 *
 * @author USER
 */
public class Duck implements Comparable{
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    //Implemented Hook
    @Override
    public int compareTo(Object object) {
        Duck duck = (Duck) object;
        return this.weight > duck.weight ? 1 : (this.weight  == duck.weight ? 0 : -1);
    }

    @Override
    public String toString() {
        return "Duck{" + "name=" + name + ", weight=" + weight + '}';
    }
    
}
