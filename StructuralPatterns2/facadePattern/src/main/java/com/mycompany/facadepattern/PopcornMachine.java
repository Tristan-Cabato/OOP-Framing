/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class PopcornMachine {
    private final String name;

    public PopcornMachine(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Popcorn Machine is on");
    }

    public void off() {
        System.out.println(name + " Popcorn Machine is off");
    }

    public void chooseFlavor(String flavor) {
        System.out.println("%s Popcorn Machine is cooking %s".formatted(name, flavor));
    }
}
