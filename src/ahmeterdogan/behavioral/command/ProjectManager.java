package ahmeterdogan.behavioral.command;

import java.util.ArrayList;

public class ProjectManager {
    private ArrayList<IWorker> workers = new ArrayList<>();
    private Project project;

    public ProjectManager(Project project) {
        this.project = project;
    }

    public void addWorker(IWorker worker) {
        workers.add(worker);
    }

    public void manage() {
        workers.forEach(IWorker::work);
    }
}
