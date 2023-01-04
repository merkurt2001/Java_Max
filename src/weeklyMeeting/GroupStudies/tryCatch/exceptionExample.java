package weeklyMeeting.GroupStudies.tryCatch;

public class exceptionExample {
    public static void main(String[] args) throws Exception {

        Test ex = new Test();
        int cardNo = 1234;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);//we should add exception to method

    }
}

class Test{
    void readCard(int cardNo) throws Exception{
        System.out.println("reading card");
    }

    void checkCard (int cardNo) throws RuntimeException{
        System.out.println("checking card");
    }
}
