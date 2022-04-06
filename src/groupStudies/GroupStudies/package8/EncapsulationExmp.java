package groupStudies.GroupStudies.package8;

public class EncapsulationExmp {

    private int account_balance;

    public void deposit(int a) {

        if (a < 0) {
            System.out.println("invalid value");
        } else {
            account_balance = account_balance + a;
        }


        System.out.println(account_balance);
    }

}
