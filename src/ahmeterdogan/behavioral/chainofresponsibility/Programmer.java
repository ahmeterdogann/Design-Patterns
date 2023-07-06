package ahmeterdogan.behavioral.chainofresponsibility;
public class Programmer extends Worker {

    @Override
    public void work(Project project) {
        System.out.println("Proje kodlanıyor");
        project.setState(ProjectState.CODING);
        setNextWorker(new QA());
        nextWorker.work(project);
    }
}
