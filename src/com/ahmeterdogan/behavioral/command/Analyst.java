package com.ahmeterdogan.behavioral.command;

public class Analyst implements IWorker{
    private Project project;
    public Analyst(Project project) {
        this.project = project;
    }
    @Override
    public void work() {
        System.out.println("Proje analiz ediliyor");
        project.setState(ProjectState.ANALYZING);
    }
}
