package weeklyMeeting.GroupStudies.Arrays;

public class Arrays20 {
    public static void main(String[] args) {

            String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr.length; j++) {

                    if (arr[i][j].equals("B")) {
                        break;
                    }
                    System.out.println(arr[i][j]);
                }


        }
    }
}
