package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating BankSystem...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }

}
