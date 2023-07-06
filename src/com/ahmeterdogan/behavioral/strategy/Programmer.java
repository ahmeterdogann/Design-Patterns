package com.ahmeterdogan.behavioral.strategy;

public class Programmer {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        System.out.print("Programcı : ");
        strategy.strategy();
    }
}
