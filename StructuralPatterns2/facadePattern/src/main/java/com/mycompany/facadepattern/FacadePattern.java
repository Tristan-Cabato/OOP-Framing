/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class FacadePattern {
    // Structural Pattern
    // Simple interface over a complex system (Hides it (It still exists))
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("We-the-best");
        DVDPlayers dvd = new DVDPlayers("Tag singkwenta");
        Lights lights = new Lights("Alibaba");
        PopcornMachine pm = new PopcornMachine("Winnie The Pooh");
        Projector proj = new Projector("Gaslighter");
        Screen screen = new Screen("Hello World!");
        /* Dont do this in main

        // Playing
        lights.on();
        lights.setBrightness(10);

        pm.on();
        pm.chooseFlavor("yes");

        amp.on();
        amp.setSurroundSound();
        amp.setVolume(20);

        screen.down();

        proj.on();
        proj.setWideScreen();

        dvd.on();
        dvd.watchMovie("The Real Housewives PH"); */

        System.out.println("Something theater \n" + "=".repeat(20));
        HomeTheaterFacade hm = new HomeTheaterFacade(amp, dvd, lights, pm, proj, screen);
        hm.turnOnTheater("The Real Housewives", "Sour Chicken BBQ");
        hm.endTheater();

        System.out.println("Music theater \n" + "=".repeat(20));
        hm.musicMode(10, 20);
    }
}
