package ahmeterdogan.behavioral.strategy;

public class DevOps {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        System.out.print("DevOps : ");
        strategy.strategy();
    }
}
