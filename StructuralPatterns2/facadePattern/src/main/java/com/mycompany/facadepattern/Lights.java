/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class Lights {
    private final String name;

    public Lights(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Lights are on");
    }

    public void off() {
        System.out.println(name + " Lights are off");
    }

    public void setBrightness(int brightness) {
        System.out.println("%s brightness is now %d".formatted(name, brightness));
    }
}
