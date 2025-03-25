import java.util.Arrays;

public class SortEmployeeIDs {
    public static void main(String[] args) {
        int[] employeeIds = {105, 102, 110, 101, 108, 103};
        insertionSort(employeeIds);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIds));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
