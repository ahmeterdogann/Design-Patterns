package ahmeterdogan.behavioral.command;

public class Programmer implements IWorker{
    private Project project;

    public Programmer(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        project.developing();
    }
}
