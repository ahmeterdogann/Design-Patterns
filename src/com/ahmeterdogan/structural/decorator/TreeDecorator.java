package com.ahmeterdogan.structural.decorator;

public abstract class TreeDecorator implements ChristmasTree{
    private ChristmasTree tree; //Composition ilişkisi kurduk

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
