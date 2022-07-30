package groupStudies.GroupStudies.eu9Review;

public class Arrays8 {
    public static void main(String[] args) {
        int data[] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {
            if (e != key) {
               continue;

            }
        }
        System.out.println(count + " Found");
        count++;
    }
}
