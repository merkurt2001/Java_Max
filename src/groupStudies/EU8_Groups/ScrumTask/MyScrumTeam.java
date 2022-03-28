package groupStudies.EU8_Groups.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("ahmet", 11, "qa", 11111);
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);

        Tester [] testers = {tester2,tester3,tester4};

        //4 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum= new ScrumTeam("nadia", "jonas" , "mustafa", 14);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        for (Developer developer : scrum.developerList) {
            System.out.println("developer.name = " + developer.name);
        }

        scrum.removeDeveloper(13);





    }
}
