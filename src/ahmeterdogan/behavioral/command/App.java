package ahmeterdogan.behavioral.command;

public class App {
    public static void main(String[] args) {
        Project project = new Project();
        ProjectManager manager = new ProjectManager(project);

        manager.addWorker(new Analyst(project));
        manager.addWorker(new Programmer(project));
        manager.addWorker(new QA(project));
        manager.addWorker(new DevOps(project));

        manager.manage();

    }
}
