package ahmeterdogan.creational.factory;

public class NotifyFactory {
    public INotify createNotify(NotifyType type) {
        if (type == NotifyType.SMS) {
            // Buradaki nesne oluşturma süreçleri bize kalmıştır.
            // Kullanıcıdan soyutlanmıştır.
            // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
            return new SmsNotify();
        }

        else if (type == NotifyType.MAIL) {
            // Buradaki nesne oluşturma süreçleri bize kalmıştır.
            // Kullanıcıdan soyutlanmıştır.
            // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
            return new MailNotify();
        }

        else {
            return null;
        }
    }
}
