package weeklyMeeting.newPack;

import java.time.LocalDate;

public class Developer {

    public String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String jobTitle;
    public double salary;



    public static boolean hasProgrammingSkill = true;

    public Developer(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        // hasProgrammingSkill = true;// you dont give static method inside constructors it will slow the code ever never do that
    }



    public void coding(){
        System.out.println(jobTitle+ " " + name + " is coding");
    }
    public void unitTesting(){
        System.out.println(jobTitle + " " + name + " is unit testing the project");
    }

    public void fixingBugs(){
        System.out.println(jobTitle+ " " +name+ " is crying ");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
