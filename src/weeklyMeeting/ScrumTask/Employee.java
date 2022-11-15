package weeklyMeeting.ScrumTask;

public class Employee extends Person {

    String jobTitle;
    int id;
    double salary;
    String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

   /*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */
}
