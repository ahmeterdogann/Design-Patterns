package com.ahmeterdogan.behavioral.observer;

public class App {
    public static void main(String[] args) {
        Project project = new Project();
        ProjectManager manager = new ProjectManager(project);

        Analyst analyst = new Analyst(project);
        Programmer programmer = new Programmer(project);
        QA tester = new QA(project);
        DevOps devOps = new DevOps(project);

        manager.addWorker(analyst);
        manager.addWorker(programmer);
        manager.addWorker(tester);
        manager.addWorker(devOps);

        manager.notifyAllWorkers();
    }
}
