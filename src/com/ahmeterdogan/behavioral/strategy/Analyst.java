package com.ahmeterdogan.behavioral.strategy;

public class Analyst {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        System.out.print("Analist : ");
        strategy.strategy();
    }
}
