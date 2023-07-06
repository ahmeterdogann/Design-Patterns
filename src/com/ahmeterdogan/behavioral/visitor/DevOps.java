package com.ahmeterdogan.behavioral.visitor;

import java.util.Random;

public class DevOps implements SoftwareTeam{
    @Override
    public int accept(ScrumMaster scrumMaster) {
        int newSp = new Random().nextInt(30);
        System.out.printf("DevOps sp Teklif : %d Sonuç : %d%n", scrumMaster.getRandomSp(), newSp);
        return newSp;
    }
}
