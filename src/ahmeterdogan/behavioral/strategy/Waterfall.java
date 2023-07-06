package ahmeterdogan.behavioral.strategy;

public class Waterfall implements IStrategy{

    @Override
    public void strategy() {
        System.out.println("Waterfall metodu ile çalışılıyor");
    }
}
