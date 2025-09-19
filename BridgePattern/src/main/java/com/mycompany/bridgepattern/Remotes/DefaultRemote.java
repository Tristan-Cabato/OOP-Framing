package com.mycompany.bridgepattern.Remotes;
import com.mycompany.bridgepattern.*;


public class DefaultRemote extends Remote {
    // client -> DefaultRemote -> Remote -> TV
    public DefaultRemote(TV tv) {
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
}
