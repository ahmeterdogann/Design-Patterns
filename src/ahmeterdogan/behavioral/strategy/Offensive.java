package ahmeterdogan.behavioral.strategy;

public class Offensive implements Tactics{

    @Override
    public void changeTactics() {
        System.out.println("Ofansif oyuna geçildi");
    }
}
