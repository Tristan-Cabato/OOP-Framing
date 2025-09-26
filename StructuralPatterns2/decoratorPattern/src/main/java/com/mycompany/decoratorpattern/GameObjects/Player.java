/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.GameObjects;

/**
 *
 * @author tcabato
 */
public class Player extends Character{

    public Player(String character) {
        this.character = character;
    }

    @Override
    public int getHealth() {
        return 100;
    }   

    @Override
    public int getAttack() {
        return 50;
    }
}
