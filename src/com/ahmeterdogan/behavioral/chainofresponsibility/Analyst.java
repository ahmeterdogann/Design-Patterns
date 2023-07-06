package com.ahmeterdogan.behavioral.chainofresponsibility;

public class Analyst extends Worker{
    @Override
    public void work(Project project) {
        System.out.println("Proje analiz ediliyor");
        project.setState(ProjectState.ANALYZING);
        setNextWorker(new Programmer());
        nextWorker.work(project);
    }
}
