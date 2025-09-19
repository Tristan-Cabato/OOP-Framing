/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgepattern.TVs;
import com.mycompany.bridgepattern.TV;

/**
 *
 * @author tcabato
 */
public class SonyTV implements TV {
    private int volume = 10;
    
    @Override
    public void on() {
        System.out.println("Sony TV is on");
    }
    
    @Override
    public void off() {
        System.out.println("Sony TV is off");
    }
    
    @Override
    public void setVolume(int x) {
        volume += x;
        System.out.println("Sony TV volume is " + volume);
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
}
