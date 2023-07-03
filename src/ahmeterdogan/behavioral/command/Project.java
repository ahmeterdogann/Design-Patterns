package ahmeterdogan.behavioral.command;

public class Project {
    public void developing() {
        System.out.println("Proje geliştiriliyor");
    }

    public void analyzing() {
        System.out.println("Proje analiz ediliyor");
    }

    public void testing() {
        System.out.println("Proje test ediliyor");
    }

    public void deploy() {
        System.out.println("Proje deploy ediliyor");
    }
}
