public class SelectionSort {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 3, 8, 1, 9, 2, 4};

        // Display array before sorting
        System.out.println("Array before sorting: ");
        printArray(numbers);

        // Perform selection sort
        selectionSort(numbers);

        // Display array after sorting
        System.out.println("Array after sorting: ");
        printArray(numbers);
    }

    // Method to implement Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
