package groupStudies.EU8_Groups.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public int daysOfSprint;
    public ArrayList<Tester> testerList=new ArrayList<Tester>();
    public ArrayList<Developer> developerList=new ArrayList<Developer>();


    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developerList.add(developer);

    }

    public void addDevelopers(Developer [] developers){
        developerList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeID){
        testerList.removeIf(p-> p.employeeID == employeID);
    }

    public void removeDeveloper(int employeID){
        testerList.removeIf(p-> p.employeeID == employeID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", daysOfSprint=" + daysOfSprint +
                ", testerList=" + testerList +
                ", developerList=" + developerList +
                '}';
    }
}
