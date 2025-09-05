/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod;

import com.mycompany.factorymethod.Borgers.BurgerFactory;
import com.mycompany.factorymethod.Interface.Burger;

/**
 *
 * @author tcabato
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Burger burger = BurgerFactory.cookBurger("CHICKENBURGER");
        burger.eat();
    }
}
