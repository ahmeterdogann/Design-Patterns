package ahmeterdogan.behavioral.chainofresponsibility;
public class Project {
    private ProjectState state;
    public ProjectState getState() {
        return state;
    }
    public void setState(ProjectState state) {
        this.state = state;
    }
}
