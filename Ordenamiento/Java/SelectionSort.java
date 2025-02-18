public class SelectionSort{

    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++){
            int min_idx = i;

            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
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
        selectionSort(arr, arr.length);
        printArray(arr);  // Print the sorted array
    }
}
