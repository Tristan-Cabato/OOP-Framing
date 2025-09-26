/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class Screen {
    private final String name;

    public Screen(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " Screen is scrolled up");
    }

    public void down() {
        System.out.println(name + " Screen is scrolled down");
    }
}
