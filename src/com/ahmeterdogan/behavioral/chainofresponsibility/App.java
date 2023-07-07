package com.ahmeterdogan.behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {

        //Sorumluluk sırasını sınıfların dışından da belirleyebilirdik. Bu örnekte içerden belirledik.

        Analyst analyst = new Analyst();
        Project project = new Project();

        analyst.work(project);
    }
}
