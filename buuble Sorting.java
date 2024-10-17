public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1, 9, 2, 4};

        System.out.println("Array before sorting: ");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Array after sorting: ");
        printArray(numbers);
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
