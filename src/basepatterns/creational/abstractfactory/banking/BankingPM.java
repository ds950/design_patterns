package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages Banking project...");
    }
}
