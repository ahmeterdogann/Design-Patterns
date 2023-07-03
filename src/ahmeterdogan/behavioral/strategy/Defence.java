package ahmeterdogan.behavioral.strategy;

public class Defence implements Tactics{
    @Override
    public void changeTactics() {
        System.out.println("Defansif oyuna geçildi");
    }
}
