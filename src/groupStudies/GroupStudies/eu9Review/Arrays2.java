package groupStudies.GroupStudies.eu9Review;

public class Arrays2 {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) {
                continue;

            }
            System.out.println("Work Done");
            continue;
        }


    }
}
