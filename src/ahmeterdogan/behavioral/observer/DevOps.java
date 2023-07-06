package ahmeterdogan.behavioral.observer;

public class DevOps implements IWorker {
    private Project project;

    public DevOps(Project project) {
        this.project = project;
    }

    @Override
    public void getNotify(String str) {
        System.out.println("DevOps : Yöneticiden haber geldi : " + str);
    }
}
