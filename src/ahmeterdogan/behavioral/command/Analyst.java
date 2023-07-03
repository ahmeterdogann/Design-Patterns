package ahmeterdogan.behavioral.command;

public class Analyst implements IWorker{
    private Project project;

    public Analyst(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        project.analyzing();
    }
}
