package com.ahmeterdogan.behavioral.mediator;

public class QA extends IWorker {

    public QA(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }

    @Override
    public String toString() {
        return "QA " + name;
    }
}
