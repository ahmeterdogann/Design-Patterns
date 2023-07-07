package com.ahmeterdogan.behavioral.mediator;

public abstract class IWorker {
    protected String name;
    private ChatRoom chatRoom;

    public IWorker(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        connectChat();
    }

    public void sendPublicMessage(String msg) {
        chatRoom.sendPublicMessage(msg, this);
    }

    public void sendPrivateMessage(String msg, IWorker receiver) {
        chatRoom.sendPrivateMessage(msg, this, receiver);
    }
    public void receiveMessage(String msg) {
        System.out.println(msg);
    }

    public void connectChat() {
        chatRoom.subscribe(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
