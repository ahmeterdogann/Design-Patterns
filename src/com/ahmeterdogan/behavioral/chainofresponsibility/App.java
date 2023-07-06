package com.ahmeterdogan.behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        Analyst analyst = new Analyst();
        Project project = new Project();

        analyst.work(project);
    }
}
