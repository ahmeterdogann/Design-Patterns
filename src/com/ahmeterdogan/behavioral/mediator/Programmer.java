package com.ahmeterdogan.behavioral.mediator;

public class Programmer extends IWorker {
    public Programmer(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public String toString() {
        return "Programmer " + name;
    }
}
