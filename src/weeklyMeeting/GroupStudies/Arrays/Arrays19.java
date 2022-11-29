package weeklyMeeting.GroupStudies.Arrays;

public class Arrays19 {

    public static void main(String[] args) {
        String[][] arr = {{"A","B","C"},{"D","E"}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j].equals("B")){
                    break;
                }
            }

        }
    }
}
