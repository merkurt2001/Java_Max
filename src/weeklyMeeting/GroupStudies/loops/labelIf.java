package weeklyMeeting.GroupStudies.loops;

public class labelIf {
    public static void main(String[] args) {
        outer:
        for(int i = 0; i < 3; i++){
            inner:
            for(int j = 0; j < 3; j++){
                if(i == 2 || j ==2)
                    continue outer;
                System.out.print(i + " " + j + ", ");
            }
        }
    }
}
