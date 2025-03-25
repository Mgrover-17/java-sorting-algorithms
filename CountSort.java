import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12, 16, 10, 13, 15, 14, 17};
        int minAge = 10, maxAge = 18;
        int[] sortedAges = countingSort(ages, minAge, maxAge);
        System.out.println("Sorted Ages: " + Arrays.toString(sortedAges));
    }

    public static int[] countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int num : arr) {
            count[num - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        return output;
    }
}
