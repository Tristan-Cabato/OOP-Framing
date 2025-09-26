/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class DVDPlayers {
    private final String name;

    public DVDPlayers(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " DVD Player is on");
    }

    public void off() {
        System.out.println(name + " DVD Player is off");
    }

    public void watchMovie(String movieName) {
        System.out.println("%s DVDPlayer is now playing %s".formatted(name, movieName));
    }

    public void endMovie(String movieName) {
        System.out.println("%s DVDPlayer stopped playing".formatted(name));
    }
    public void endMovie() {
        System.out.println("%s DVDPlayer stopped playing");
    }
}
