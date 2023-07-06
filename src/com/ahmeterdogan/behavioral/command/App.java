package com.ahmeterdogan.behavioral.command;

public class App {
    public static void main(String[] args) {
        Project project = new Project();
        ProjectManager manager = new ProjectManager(project);

        Analyst analyst = new Analyst(project);
        manager.manage(analyst);
        System.out.println(project.getState());

        Programmer programmer = new Programmer(project);
        manager.manage(programmer);
        System.out.println(project.getState());

        QA tester = new QA(project);
        manager.manage(tester);
        System.out.println(project.getState());

        DevOps devOps = new DevOps(project);
        manager.manage(devOps);
        System.out.println(project.getState());

        manager.listActions();


    }
}
