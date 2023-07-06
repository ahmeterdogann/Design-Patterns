package com.ahmeterdogan.creational.factory;

public class App {
    public static void main(String[] args) {
        NotifyFactory factory = new NotifyFactory();
        INotify notify = factory.createNotify(NotifyType.SMS);
        notify.sendNotification(new User());
        INotify notify1 = factory.createNotify(NotifyType.MAIL);
        notify1.sendNotification(new User());

    }
}
