package com.ahmeterdogan.behavioral.strategy;
public class App {
    public static void main(String[] args) {
        Agile agile = new Agile();
        Analyst analyst = new Analyst();
        analyst.setStrategy(agile);
        analyst.work();
        Programmer programmer = new Programmer();
        programmer.setStrategy(agile);
        programmer.work();
        QA tester = new QA();
        tester.setStrategy(agile);
        tester.work();
        DevOps devOps = new DevOps();
        devOps.setStrategy(agile);
        devOps.work();

        System.out.println();

        Waterfall waterfall = new Waterfall();
        programmer.setStrategy(waterfall);
        programmer.work();
    }
}
