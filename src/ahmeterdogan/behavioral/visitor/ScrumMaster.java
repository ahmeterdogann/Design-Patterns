package ahmeterdogan.behavioral.visitor;

import java.util.Random;

public class ScrumMaster implements Visitor{
    private int sprintSp;
    private int randomSp;
    @Override
    public void visitAnalyst(SoftwareTeam team) {
        randomSp = new Random().nextInt(30);
        sprintSp += team.accept(this);
    }

    @Override
    public void visitProgrammer(SoftwareTeam team) {
        randomSp = new Random().nextInt(30);
        sprintSp += team.accept(this);
    }

    @Override
    public void visitQA(SoftwareTeam team) {
        randomSp = new Random().nextInt(30);
        sprintSp += team.accept(this);
    }

    @Override
    public void visitDevOps(SoftwareTeam team) {
        randomSp = new Random().nextInt(30);
        sprintSp += team.accept(this);
    }

    public int getSprintSp() {
        return sprintSp;
    }

    public int getRandomSp() {
        return randomSp;
    }
}
