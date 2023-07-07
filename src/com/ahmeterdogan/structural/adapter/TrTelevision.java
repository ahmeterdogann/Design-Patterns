package com.ahmeterdogan.structural.adapter;

public class TrTelevision implements TurkishDevice{

    @Override
    public void plugIn() {
        System.out.println("Tr televizyon çalışıyor");
    }
}
