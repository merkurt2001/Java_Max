package weeklyMeeting.newPack;

import java.time.LocalDate;

public class Tester {

    public String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name) {
        this.name = name;
        // jobTitle = "Unknown";
    }

    public Tester(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Tester(String name, char gender, LocalDate DOB) {
        this(name, gender);
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
    }

    public Tester(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary){
        this(name, gender, DOB);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }



    public void smokeTesting(){
        System.out.println(jobTitle +" "+ name +" is smoke testing");
    }

    public void creatingTicket(String ticketNumber){
        System.out.println(jobTitle +" "+ name +" is creating ticket " + ticketNumber);
    }

    @Override
    public String toString() {
        return "Tester{" +
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
