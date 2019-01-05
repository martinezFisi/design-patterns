/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.test;

import com.unmsm.template.CoffeBeverage;
import com.unmsm.template.TeaBeverage;

/**
 *
 * @author USER
 */
public class TestMain {
    public static void main(String[] args) {
        CoffeBeverage coffeBeverage = new CoffeBeverage();
        TeaBeverage teaBeverage = new TeaBeverage();
        coffeBeverage.prepareRecipe();
        System.out.println("");
        teaBeverage.prepareRecipe();
    }
}
