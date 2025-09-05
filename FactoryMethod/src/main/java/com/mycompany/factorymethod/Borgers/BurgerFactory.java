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
public class BurgerFactory {
    public BurgerFactory() {
    }

    public static Burger cookBurger(String text) {
        switch (text) {
            case "CHEESEBURGER" -> {
                return new CheeseBurger();
            }
            case "CHICKENBURGER" -> {
                return new ChickenBurger();
            } default -> {
                return new CheeseBurger();
            }
        }
    }
}
