package com.ahmeterdogan.structural.adapter;

public class EnSocket implements EnglishTypeSocket{
    @Override
    public void getVolt(EnglishDevice englishDevice) {
        englishDevice.plugIn();
    }
}
