package weeklyMeeting.GroupStudies.Sorts;

import java.util.Arrays;

public class differentSorts {
    public static void main(String[] args) {
        int[] array = {8, 6, 7, 9, 5, 3, 4, 2, 1, 0};
        System.out.println("sortGnome(array) = " + Arrays.toString(sortGnome(array)));
        System.out.println("sortBubble(array) = " + Arrays.toString(sortBubble(array)));
        System.out.println("sortSelection(array) = " + Arrays.toString(sortSelection(array)));
        System.out.println("sortInsertion(array) = " + Arrays.toString(sortInsertion(array)));
        System.out.println("sortCocktail(array) = " + Arrays.toString(sortCocktail(array)));
        System.out.println("sortComb(array) = " + Arrays.toString(sortComb(array)));
        System.out.println("sortCounting(array) = " + Arrays.toString(sortCounting(array)));
        System.out.println("sortShell(array) = " + Arrays.toString(sortShell(array)));
        System.out.println("sortBucket(array) = " + Arrays.toString(sortBucket(array)));
        System.out.println("sortBubble(array) = " + Arrays.toString(sortBubble(array)));
        System.out.println("sortGnomeFor(array) = " + Arrays.toString(sortGnomeFor(array)));


    }
    public static int[] sortGnome(int[] arr)  {
        int i = 1;
        int j = 2;

        while (i < arr.length) {
            if (arr[i - 1] <= arr[i]) {
                i = j;
                j++;
            } else {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }

        }
        return arr;
    }

    public static int[] sortBubble(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public static int[] sortSelection(int[] arr) {
        for (int currentPlace = 0; currentPlace < arr.length; currentPlace++) {
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace + 1;
            for (int check = currentPlace; check < arr.length; check++) {
                if (arr[check] < smallest) {
                    smallestAt = check;
                    smallest = arr[check];
                }
            }
            int temp = arr[currentPlace];
            arr[currentPlace] = arr[smallestAt];
            arr[smallestAt] = temp;
        }

        return arr;
    }

    public static int[] sortInsertion (int[] arr){

        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }

        return arr;
    }

    public static int[] sortCocktail(int[] arr){

        boolean swapped;
        do {
            swapped = false;
            for (int i =0; i<=  arr.length  - 2;i++) {
                if (arr[ i ] > arr[ i + 1 ]) {
                    //test if two elements are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i= arr.length - 2;i>=0;i--) {
                if (arr[ i ] > arr[ i + 1 ]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return arr;
    }

    public static int[] sortComb(int[] arr){

        int gap_length = arr.length;
        float shrinkFactor = 1.3f;
        boolean swapped = false;

        while (gap_length > 1 || swapped) {
            if (gap_length > 1) {
                gap_length = (int)(gap_length / shrinkFactor);
            }

            swapped = false;

            for (int i = 0; gap_length + i < arr.length; i++) {
                if (arr[i] > arr[i + gap_length]) {
                    int temp = arr[i];
                    arr[i] = arr[i+gap_length];
                    arr[i+gap_length] = temp;
                    swapped = true;
                }
            }
        }

        return arr;
    }

    public static int[] sortCounting(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int each: arr){
            if (each>max)max=each;
            if(each<min)min=each;
        }

        int[] ctr = new int[max - min + 1];
        for(int number : arr){
            ctr[number - min]++;
        }
        int z= 0;
        for(int i= min;i <= max;i++){
            while(ctr[i - min] > 0){
                arr[z]= i;
                z++;
                ctr[i - min]--;
            }
        }
        return arr;
    }

    public static int[] sortShell(int[] arr){

        int increment = arr.length / 2;
        while (increment > 0) {
            for (int i = increment; i < arr.length; i++) {
                int j = i;
                int temp = arr[i];
                while (j >= increment && arr[j - increment] > temp) {
                    arr[j] = arr[j - increment];
                    j = j - increment;
                }
                arr[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            }
            else {
                increment *= (5.0 / 11);
            }
        }
        return arr;
    }

    public static int[] sortBucket(int[] arr){
        int max_value = arr[0];
        for (int each :arr){
            if (each>max_value)max_value=each;
        }
        int[] Bucket = new int[max_value + 1];
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            Bucket[arr[i]]++;
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted[outPos++] = i;

        return sorted;
    }

    public static double[] sortBubble(double[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public static int[] sortGnomeFor(int[] arr) {
        for (int i = 1, j = 2; i < arr.length; ) {
            if (arr[i - 1] <= arr[i]) {
                i = j;
                j++;
            } else {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i--] = tmp;
                i = (i == 0) ? j++ : i;
            }

        }
        return arr;
    }
}
