package ahmeterdogan.behavioral.command;

public class DevOps implements IWorker{
    private Project project;

    public DevOps(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        project.deploy();
    }
}
