package ahmeterdogan.creational.factory;

public class SmsNotify implements INotify{
    @Override
    public void sendNotification(User user) {
        System.out.println("SMS gönderildi");
    }
}
