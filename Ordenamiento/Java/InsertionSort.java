public class InsertionSort{

    static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j = j - 1;
            }
        }
    }

    // Print the array
    static void printArray(int arr[]) {
        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr, arr.length);
        printArray(arr);  // Print the sorted array
    }
}
