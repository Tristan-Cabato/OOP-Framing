/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadepattern;

/**
 *
 * @author tcabato
 */
public class HomeTheaterFacade {
    private final Amplifier amp;
    private final DVDPlayers dvd;
    private final Lights lights;
    private final PopcornMachine pm;
    private final Projector proj;
    private final Screen screen;

    public HomeTheaterFacade(Amplifier amp, DVDPlayers dvd, Lights lights, PopcornMachine pm, Projector proj,
            Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.lights = lights;
        this.pm = pm;
        this.proj = proj;
        this.screen = screen;
    }

    public void turnOnTheater(String movie) {
        screen.down();

        proj.on();
        proj.setWideScreen();

        dvd.on();
        dvd.watchMovie(movie);
    }

    public void turnOnTheater(String movie, String flavor) {
        pm.on();
        pm.chooseFlavor(flavor);

        screen.down();

        proj.on();
        proj.setWideScreen();

        dvd.on();
        dvd.watchMovie(movie);
    }

    public void endTheater() {
        lights.off();
        pm.off();
        amp.off();
        screen.up();
        proj.off();
        dvd.endMovie();
        dvd.off();
    }

    public void musicMode(int brightness, int volume) {
        lights.on();
        lights.setBrightness(brightness);

        amp.on();
        amp.setSurroundSound();
        amp.setVolume(volume);
    }
}
