package com.ahmeterdogan.behavioral.chainofresponsibility;

public class QA extends Worker{

    @Override
    public void work(Project project) {
        System.out.println("Proje test ediliyor");
        project.setState(ProjectState.TESTING);
        setNextWorker(new DevOps());
        nextWorker.work(project);
    }
}
