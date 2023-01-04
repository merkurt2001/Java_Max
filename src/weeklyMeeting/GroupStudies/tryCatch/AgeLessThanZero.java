package weeklyMeeting.GroupStudies.tryCatch;

public class AgeLessThanZero extends RuntimeException {

    public AgeLessThanZero(String ohNo) {
        super(ohNo);
    }
}
