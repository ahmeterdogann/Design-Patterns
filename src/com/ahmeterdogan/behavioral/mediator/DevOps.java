package com.ahmeterdogan.behavioral.mediator;

public class DevOps extends IWorker{

    public DevOps(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public String toString() {
        return "DevOps " + name;
    }
}
