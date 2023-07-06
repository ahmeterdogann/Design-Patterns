package com.ahmeterdogan.behavioral.visitor;

public interface Visitor {
    void visitAnalyst(SoftwareTeam team);
    void visitProgrammer(SoftwareTeam team);
    void visitQA(SoftwareTeam team);
    void visitDevOps(SoftwareTeam team);
}
