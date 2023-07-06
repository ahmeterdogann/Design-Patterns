package com.ahmeterdogan.behavioral.command;

public class Programmer implements IWorker{
    private Project project;

    public Programmer(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Proje kodlanıyor");
        project.setState(ProjectState.CODING);
    }
}
