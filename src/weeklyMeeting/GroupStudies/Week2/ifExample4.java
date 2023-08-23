package weeklyMeeting.GroupStudies.Week2;

public class ifExample4 {

    public static void main(String[] args) {

        int salary = 350000;
        int yearOnJob = 1;

        if (salary >=30000){
            if (yearOnJob>=2){
                System.out.println("You quilify for the loan");
            }else {
                System.out.println("You must have been on your current job at least 2 years");
            }
        }else {
            System.out.println("You must earn at least $30000 per year");
        }


    }
}
