package weeklyMeeting.newPack;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {


    public String PO, BA, SM;
    public ArrayList<Tester> testers;// we will be able to add or remove so we need to use arraylist
    public ArrayList<Developer> developers;
    public int dayOfSprint;


    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public void addTester(Tester tester){ // adds one tester to the testers team
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){ // adds multiple tester to the testers team
        this.testers.addAll( Arrays.asList( testers)  );
    }

    public void addDeveloper(Developer dev){ //  adds one developer to the developers team
        developers.add(dev);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll( Arrays.asList(developers));
    }

    public void removeTester(String id){
        testers.removeIf( p -> p.employeeId.equalsIgnoreCase(id) );
    }

    public void removeDevelopers(String id){
        developers.removeIf( p -> p.employeeId.equals(id) );
    }
    public void removeDeveloper(String id){
        developers.removeIf(p -> p.employeeId.equalsIgnoreCase(id));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers +
                ", developers=" + developers +
                ", dayOfSprint=" + dayOfSprint +
                '}';
    }
}

