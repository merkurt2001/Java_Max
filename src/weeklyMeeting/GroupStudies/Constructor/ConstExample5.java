package weeklyMeeting.GroupStudies.Constructor;

class CheckingAccount {
    public int amount;
    //line1

    public CheckingAccount() {
        this.amount = 100;
    }
}


public class ConstExample5 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();
        //line2
        System.out.println(acct.amount);
        acct.amount=200;
        System.out.println(acct.amount);


    }
}
