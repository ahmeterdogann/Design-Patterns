package com.ahmeterdogan.behavioral.command;

public class QA implements IWorker {

    private Project project;

    public QA(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Proje test ediliyor");
        project.setState(ProjectState.TESTING);
    }
}
