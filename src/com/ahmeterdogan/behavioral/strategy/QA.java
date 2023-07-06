package com.ahmeterdogan.behavioral.strategy;

public class QA {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        System.out.print("Tester : ");
        strategy.strategy();
    }
}
