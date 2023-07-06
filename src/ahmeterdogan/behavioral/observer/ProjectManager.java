package ahmeterdogan.behavioral.observer;

import java.util.ArrayList;

//Invoker class
public class ProjectManager {
    private ArrayList<IWorker> workers = new ArrayList<>();
    private Project project;

    public ProjectManager(Project project) {
        this.project = project;
    }


    public void addWorker(IWorker worker) {
        workers.add(worker);
    }

    public void removeWorker(IWorker worker) {
        workers.remove(worker);
    }

    public void notifyAllWorkers() {
        workers.forEach(worker -> worker.getNotify("Proje iptal"));
    }
}
