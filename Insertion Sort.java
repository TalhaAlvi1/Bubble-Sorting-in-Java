public class InsertionSort {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 3, 8, 1, 9, 2, 4};

        // Display array before sorting
        System.out.println("Array before sorting: ");
        printArray(numbers);

        // Perform insertion sort
        insertionSort(numbers);

        // Display array after sorting
        System.out.println("Array after sorting: ");
        printArray(numbers);
    }

    // Method to implement Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than the key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at the correct position
            arr[j + 1] = key;
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
