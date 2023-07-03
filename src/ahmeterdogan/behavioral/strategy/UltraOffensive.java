package ahmeterdogan.behavioral.strategy;

public class UltraOffensive implements Tactics{
    @Override
    public void changeTactics() {
        System.out.println("Ultra ofansif oyuna geçildi.");
    }
}
