package ahmeterdogan.behavioral.strategy;

public class UltraDefence implements Tactics{
    @Override
    public void changeTactics() {
        System.out.println("Ultra defansif oyuna geçildi");
    }
}
