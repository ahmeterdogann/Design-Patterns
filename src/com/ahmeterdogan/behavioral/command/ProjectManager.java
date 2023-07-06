package com.ahmeterdogan.behavioral.command;

import java.util.ArrayList;

//Invoker class
public class ProjectManager {
    private ArrayList<IWorker> actions = new ArrayList<>();
    private Project project;

    public ProjectManager(Project project) {
        this.project = project;
    }

    public void manage(IWorker worker) {
        actions.add(worker);
        worker.work();
    }

    public void listActions() {
        actions.forEach((a) -> System.out.println(a.getClass()));
    }
}
