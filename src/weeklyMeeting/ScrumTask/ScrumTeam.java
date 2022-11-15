package weeklyMeeting.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public ScrumMaster SM;
    public BusinessAnalyst BA;


    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, ScrumMaster SM, BusinessAnalyst BA) {
        this.PO = PO;
        this.SM = SM;
        this.BA = BA;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTesters(Tester[] testersList) {
        testers.addAll(Arrays.asList(testersList));
    }


    public void removeTester(int id) {
        testers.removeIf(p -> p.id == id);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developersList) {
        developers.addAll(Arrays.asList(developersList));
    }


    public void removeDeveloper(int id) {
        developers.removeIf(p -> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
    /*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

            Methods:
                addTester(Tester tester): adds the given tester to testers arraylist

                ddTesters(Tester[] testers): adds the given testers to testers arraylist

                removeTester(int id): removes the tester with the given id from the arraylist of tester

                addDeveloper(Developer developer): adds the given developer to testers arraylist

                addDeveloper(Developer[] developer): adds the given developers to testers arraylist

                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */
}
