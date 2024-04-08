public class Solution {

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        quickS(input, startIndex, endIndex);
    }

    public static void quickS(int[] input, int low, int high) {
        if (low < high) {
            int pIndex = partition(input, low, high);
            quickS(input, low, pIndex - 1);
            quickS(input, pIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
