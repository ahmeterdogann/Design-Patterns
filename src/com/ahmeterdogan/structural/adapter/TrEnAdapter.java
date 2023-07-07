package com.ahmeterdogan.structural.adapter;

public class TrEnAdapter implements EnglishDevice{
    private TurkishDevice turkishDevice;

    public TrEnAdapter(TurkishDevice turkishDevice) {
        this.turkishDevice = turkishDevice;
    }
    @Override
    public void plugIn() {
        turkishDevice.plugIn();
    }
}
