/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridgepattern;
import com.mycompany.bridgepattern.TVs.*;
import com.mycompany.bridgepattern.Remotes.*;

/**
 *
 * @author tcabato
 */
public class BridgePattern {
    // Separates abstraction (Remote) from implementation (TV)
    // Separation of concern
    public static void main(String[] args) {
        TV exampleTV = new SonyTV();
        Remote exampleRemote = new DefaultRemote(exampleTV);
        // Client (exampleTV) -> DefaultRemote receives it -> Remote
            exampleRemote.powerOn();
            exampleRemote.setVolume(100);
            exampleRemote.powerOff();

        printSeparator();
        Remote smartExampleRemote = new SmartRemote(exampleTV);
            smartExampleRemote.powerOn();
            smartExampleRemote.setVolume(3);
            smartExampleRemote.powerOff();
            ((SmartRemote)smartExampleRemote).netflix(); // TypeCast

        printSeparator();
        TV smasnugTV = new SamsungTV();
        Remote smasnugRemote = new SmartRemote(smasnugTV);
            smasnugRemote.powerOn();
            smasnugRemote.setVolume(20);
            smasnugRemote.powerOff();
            ((SmartRemote)smasnugRemote).netflix();
            ((SmartRemote)smasnugRemote).youtube();
    }

    public static void printSeparator() {
        System.out.println("=".repeat(20));
    }
}
