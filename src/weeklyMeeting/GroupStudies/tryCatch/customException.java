package weeklyMeeting.GroupStudies.tryCatch;

public class customException {
    public static void main(String[] args) {
        validateAge(-3);
    }

    public static void validateAge(int age){
        if (age< 0){
            throw new AgeLessThanZero("oh no! Do not do it");
        }
    }
}
