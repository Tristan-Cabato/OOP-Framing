/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class Amplifier {
    private final String name;

    public Amplifier(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Amplifier is on");
    }

    public void off() {
        System.out.println(name + " Amplifier is off");
    }

    public void setVolume(int volume) {
        System.out.println("%s volume is now %d".formatted(name, volume));
    }

    public void setSurroundSound() {
        System.out.println("%s Amplifier Surround Sound activated".formatted(name));
    }
}
