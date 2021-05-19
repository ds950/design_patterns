package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.banking.BankingTeamFactory;
import basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Auction project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
