package com.ahmeterdogan.behavioral.command;

public class Project {
    private ProjectState state;

    public void setState(ProjectState state) {
        this.state = state;
    }

    public ProjectState getState() {
        return state;
    }
}
