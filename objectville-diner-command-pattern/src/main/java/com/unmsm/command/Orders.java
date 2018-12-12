/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unmsm.command;

import com.unmsm.receiver.Chef;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author amartinez <amartinez@novatronic.com>
 */
public class Orders implements Order{
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }
    
    @Override
    public void orderUp(Chef chef) {
        for (Order order : orders) {
            order.orderUp(chef);
        }
    }
    
    
}
