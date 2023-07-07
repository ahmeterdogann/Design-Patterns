package com.ahmeterdogan.structural.proxy;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String address) throws Exception {
        System.out.println("Connecting to " + address);
    }
}
