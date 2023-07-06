package ahmeterdogan.behavioral.observer;

public class Analyst implements IWorker {
    private Project project;
    public Analyst(Project project) {
        this.project = project;
    }
    @Override
    public void getNotify(String str) {
        System.out.println("Analist : Yöneticiden haber geldi : " + str);
    }
}
