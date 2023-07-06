package com.ahmeterdogan.behavioral.command;

public class DevOps implements IWorker{
    private Project project;

    public DevOps(Project project) {
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Proje deploy ediliyor");
        project.setState(ProjectState.DEPLOYING);
    }
}
