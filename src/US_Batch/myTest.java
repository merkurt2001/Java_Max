package US_Batch;

public class myTest {

    public static void main(String[] args) {

        int end = 10; // Change this value to set the end limit

        int number = 1;
        while (number <= end) {
            // Check if the number is odd
            if (number % 2 != 0) {
                System.out.print(number);

                // Add a comma if it's not the last odd number
                if (number < end - 1 && number % 2 != 0) {
                    System.out.print(", ");
                }
            }

            number++;
    }}
}