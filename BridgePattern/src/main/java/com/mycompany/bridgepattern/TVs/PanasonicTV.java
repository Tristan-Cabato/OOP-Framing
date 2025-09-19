package com.mycompany.bridgepattern.TVs;
import com.mycompany.bridgepattern.TV;

public class PanasonicTV implements TV {
    private int volume = 50;
    
    @Override
    public void on() {
        System.out.println("Panasonic TV is on");
    }
    
    @Override
    public void off() {
        System.out.println("Panasonic TV is off");
    }
    
    @Override
    public void setVolume(int x) {
        volume += x;
        System.out.println("Panasonic TV volume is " + volume);
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
}
