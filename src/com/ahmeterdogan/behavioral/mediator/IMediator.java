package com.ahmeterdogan.behavioral.mediator;

public interface IMediator {
    void subscribe(IWorker worker);

    void sendPublicMessage(String msg, IWorker sender);

    void sendPrivateMessage(String msg, IWorker sender, IWorker receiver);
}
