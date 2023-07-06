package ahmeterdogan.behavioral.chainofresponsibility;

public abstract class Worker {
    protected Worker nextWorker;

    public void setNextWorker(Worker worker) {
        nextWorker = worker;
    }

    public abstract void work(Project project);
}
