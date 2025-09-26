/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class Projector {
    private final String name;

    public Projector(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Projector is on");
    }

    public void off() {
        System.out.println(name + " Projector is off");
    }

    public void setVolume(int volume) {
        System.out.println("%s volume is now %d".formatted(name, volume));
    }

    public void setWideScreen() {
        System.out.println("%s Projector Wide Screen activated".formatted(name));
    }
}
