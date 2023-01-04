package weeklyMeeting.GroupStudies.tryCatch;

public class Throw {


  //throw keyword: manually throws exception. In this situation, when exception is thrown,
  // execution is stopped. If we want to continue execution, we must handle this exception as well

    public static void main(String[] args) {
        validateAge(-5);
    }

    private static void validateAge(int age) {

        if(age<0){
            throw new ArithmeticException("not valid number");
        }else{
            System.out.println("valid number");
        }
    }


}
