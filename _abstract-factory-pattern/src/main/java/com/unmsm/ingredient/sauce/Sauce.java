/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.ingredient.sauce;

/**
 *
 * @author amartinez <amartinez@novatronic.com>
 */
public interface Sauce {
    default String getName(){
        return this.getClass().getSimpleName();
    }
}
