package weeklyMeeting.GroupStudies.loops;

public class whileExample7 {
    public static void main(String[] args) {
        int a = 0, b = 10;
        while(b - 2 > 0){
            b -= 2;
            while(a + 2 < 10){
                a += 2;
                if(a == b)
                    continue;

                System.out.print(a + " " + b + ", ");
            }
        }
    }
}
