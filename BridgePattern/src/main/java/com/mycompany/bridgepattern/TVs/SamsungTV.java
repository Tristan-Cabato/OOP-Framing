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
public class SamsungTV implements TV {
    private int volume = 30;
    @Override
    public void on() {
        System.out.println("Samsung TV is on");
    }
    
    @Override
    public void off() {
        System.out.println("Samsung TV is off");
    }
    
    @Override
    public void setVolume(int x) {
        volume += x;
        System.out.println("Samsung TV volume is " + volume);
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
}
