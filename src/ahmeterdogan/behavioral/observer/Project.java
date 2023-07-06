package ahmeterdogan.behavioral.observer;

public class Project {
    private ProjectState state;

    public void setState(ProjectState state) {
        this.state = state;
    }

    public ProjectState getState() {
        return state;
    }
}
