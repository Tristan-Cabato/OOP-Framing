package com.mycompany.bridgepattern.Remotes;
import com.mycompany.bridgepattern.*;

public class SmartRemote extends Remote {
    // client -> SmartRemote -> Remote -> TV
    public SmartRemote(TV tv) {
        super(tv);
    }
    
    @Override
    public void powerOn() {
        tv.on();
    }
    
    @Override
    public void powerOff() {
        tv.off();
    }
    
    @Override
    public void setVolume(int x) {
        tv.setVolume(x);
    }
    
    @Override
    public int getVolume() {
        return tv.getVolume();
    }

    public void netflix() {
        System.out.println("Netflix is on");
    }

    public void youtube() {
        System.out.println("Youtube is on");
    }
}
