package groupStudies.GroupStudies.Sorts;

public class SortingMethods {
    public static void main(String[] args) {

        int[] array = {8, 6, 7, 9, 5, 3, 4, 2, 1, 0};

        quickSort(array, 0, array.length -1);

        for (int i : array) {

            System.out.print(i + " ");

        }



    }

    private static void quickSort(int[] arr, int start, int end){

        if(end <= start) return;

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);


    }

    private static int partition(int[] arr, int start, int end){

        int i = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end ; j++) {

            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }

        }

        i++;
        swap(arr, i, end);

        return i;

    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
