package com.ahmeterdogan.behavioral.observer;

public class Programmer implements IWorker {
    private Project project;

    public Programmer(Project project) {
        this.project = project;
    }

    @Override
    public void getNotify(String str) {
        System.out.println("Programmer : Yöneticiden haber geldi : " + str);
    }
}
