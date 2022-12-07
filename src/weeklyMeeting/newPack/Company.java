package weeklyMeeting.newPack;


import java.time.LocalDate;

public class Company {

    public static void main(String[] args) {


        Tester tester1 = new Tester("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Tester tester2 = new Tester("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Tester tester3 = new Tester("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Tester tester4 = new Tester("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);


        Tester[] testersList = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Developer developer2 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Developer developer3 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Developer developer4 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Developer developer5 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Developer developer6 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);
        Developer developer7 = new Developer("Sasha", 'F', LocalDate.of(2022, 12, 2), "123", "SDET", 1555.5);

        Developer[] developersList = {developer1, developer2, developer3, developer4, developer5, developer6, developer7};

        ScrumTeam scrum2 = new ScrumTeam("Pinar", "Emre", "Alisher", 5);

        scrum2.addDevelopers(developersList);
        scrum2.addTesters(testersList);

        for (Tester tester : scrum2.testers) {
            System.out.println(tester.name +" : "+tester.salary);
        }

        System.out.println("------------------------------------------------");

        for (Developer developer : scrum2.developers) {
            System.out.println(developer.name+" : "+developer.salary);

            System.out.println(developer.DOB);
        }







    }


}
