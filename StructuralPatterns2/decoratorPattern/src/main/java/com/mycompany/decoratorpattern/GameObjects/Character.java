/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.GameObjects;

/**
 *
 * @author tcabato
 */
public abstract class Character {
    protected String character = "Unknown Character";

    public String getCharacter() { return character; }

    public abstract int getHealth();    
    public abstract int getAttack();
}
