package weeklyMeeting.GroupStudies.loops;

public class forExample2 {

    public static void main(String[] args) {

        for (char ch= 'A'; ch<='D';ch++) {
            if (ch=='C'){
                continue;
            }
            System.out.println(ch);
            if (ch=='B'){
                break;
            }//AB
            
        }
        
    }
}
