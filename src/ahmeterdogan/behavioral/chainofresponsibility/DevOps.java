package ahmeterdogan.behavioral.chainofresponsibility;

public class DevOps extends Worker{

    @Override
    public void work(Project project) {
        System.out.println("Proje deploy ediliyor");
        project.setState(ProjectState.DEPLOYING);
    }
}
