/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.command;

import com.unmsm.receiver.Chef;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class CoffeOrder implements Order{

    @Override
    public void orderUp(Chef chef) {
        chef.makeCoffe();
    }

}
