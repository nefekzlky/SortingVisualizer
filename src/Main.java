import java.util.Scanner;

public class Main {

    public static int[] createRandomArray(int length) {

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {

            arr[i] = (int) (Math.random() * 101);

        }

        return arr;

    }

    public static void printArray(int[] arr) {

        for (int j : arr) {

            System.out.print(j + " ");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int length = sc.nextInt();

        System.out.println("Bubble Sort");
        int[] arr1 = createRandomArray(length);
        SortingAlgorithms.bubbleSort(arr1);
        printArray(arr1);

        System.out.println("\nInsertion Sort");
        int[] arr2 = createRandomArray(length);
        SortingAlgorithms.insertionSort(arr2);
        printArray(arr2);

    }
}