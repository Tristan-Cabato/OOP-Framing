/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod.Borgers;

import com.mycompany.factorymethod.Interface.Burger;

/**
 *
 * @author tcabato
 */
public class ChickenBurger implements Burger {
    @Override
    public void eat() {
        System.out.println("24 Burger");   
    }
}
