public class BubbleSort{

    static void bubbleSort(int arr[], int n) {
        boolean swapped = true;

        // Loop through the array
        while (swapped) {
            swapped = false;

            // Loop through the array and compare adjacent elements
            for (int i = 0; i < n-1 ; i++) {
                System.out.println("Comparing: " + arr[i] + " and " + arr[i + 1]);

                if (arr[i] > arr[i + 1]) {
                    // Swap the elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
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
        bubbleSort(arr, arr.length);
        printArray(arr);  // Print the sorted array
    }
}


