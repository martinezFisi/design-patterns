/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.product;

import com.unmsm.ingredient.dough.Dough;
import com.unmsm.ingredient.sauce.Sauce;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    
    abstract void prepare();
    
    
    
    
}
