public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void insertionSort(int[] arr) {

        int length = arr.length;

        for (int i = 1; i < length; i++) {

            int value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > value) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = value;

        }
    }

}
