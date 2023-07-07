package com.ahmeterdogan.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator{
    private int id;
    private String name;

    private List<IWorker> subscribers = new ArrayList<>();

    @Override
    public void subscribe(IWorker worker) {
        subscribers.add(worker);
    }

    @Override
    public void sendPublicMessage(String msg, IWorker sender) {
        for (IWorker worker : subscribers) {
            if (worker == sender)
                continue;

            worker.receiveMessage(String.format("(%s ekran) %s to public msg : %s", worker.toString(), sender.toString(), msg));
        }
    }

    @Override
    public void sendPrivateMessage(String msg, IWorker sender, IWorker receiver) {
        receiver.receiveMessage(String.format("(%s ekran) %s to %s msg : %s", receiver.toString(), sender.toString(), receiver.toString(), msg));
    }

}
