package ahmeterdogan.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        Coach coach = new Coach();

        /*tüm stratejileri bir interface altında topladık ve coach sınıfının ilgili metoduna parametre olarak geçtik
          bu sayede coach sınıfının makeTacticalChange nasıl çalışacağı bilgisini dışardan aldı poliformizim kullanarak
          if else kontrollerinden kurtulduk. makeTacticalChange metodun çalışma yapısı runtime'da değişebilir hale geldi
         */

        coach.makeTacticalChange(new Defence());
        coach.makeTacticalChange(new UltraDefence());
        coach.makeTacticalChange(new Offensive());
        coach.makeTacticalChange(new UltraOffensive());
    }
}
