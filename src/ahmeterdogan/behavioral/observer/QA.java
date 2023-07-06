package ahmeterdogan.behavioral.observer;

public class QA implements IWorker {

    private Project project;

    public QA(Project project) {
        this.project = project;
    }

    @Override
    public void getNotify(String str) {
        System.out.println("Tester : Yöneticiden haber geldi : " + str);
    }
}
