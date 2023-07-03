package ahmeterdogan.behavioral.command;

public class QA implements IWorker {

    private Project project;

    public QA(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        project.testing();
    }
}
