package groupStudies.EU8_Groups.ScrumTask;

public class Tester {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + "is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }
}
