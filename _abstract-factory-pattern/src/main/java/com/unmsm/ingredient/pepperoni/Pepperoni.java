/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ingredient.pepperoni;

/**
 *
 * @author USER
 */
public interface Pepperoni {
    default String getName(){
        return this.getClass().getSimpleName();
    }
}
