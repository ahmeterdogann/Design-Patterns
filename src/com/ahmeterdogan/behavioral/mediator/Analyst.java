package com.ahmeterdogan.behavioral.mediator;
public class Analyst extends IWorker {

    public Analyst(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public String toString() {
        return "Analyst " + name;
    }
}
