package ahmeterdogan.behavioral.visitor;

/*
Ziyaret edilecek class'lar stabil ise bu tasarım deseni kullanılması mantıklıdır. Ziyaret edilecek class sayısında
değişiklik sık sık oluyorsa uygun bir tasarım olmayabilir.
 */
public class App {
    public static void main(String[] args) {
        ScrumMaster scrumMaster = new ScrumMaster();
        Analyst analyst = new Analyst();
        Programmer programmer = new Programmer();
        QA tester = new QA();
        DevOps devOps = new DevOps();

        scrumMaster.visitAnalyst(analyst);
        scrumMaster.visitProgrammer(programmer);
        scrumMaster.visitQA(tester);
        scrumMaster.visitDevOps(devOps);

        System.out.println("Nihai sp : " + scrumMaster.getSprintSp());
    }

}
