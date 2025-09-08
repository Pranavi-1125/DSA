// import java.util.Scanner;

// public class SelectionSortCases {

// // Selection sort implementation
// public static void selectionSort(int[] arr) {
// int n = arr.length;
// for (int i = 0; i < n - 1; i++) {
// int minIndex = i;
// for (int j = i + 1; j < n; j++) {
// if (arr[j] < arr[minIndex]) {
// minIndex = j;
// }
// }
// // Swap
// int temp = arr[minIndex];
// arr[minIndex] = arr[i];
// arr[i] = temp;
// }
// }

// // Method to print array
// public static void printArray(int[] arr) {
// for (int num : arr) {
// System.out.print(num + " ");
// }
// System.out.println();
// }

// // Check if array is sorted in ascending order
// public static boolean isSortedAscending(int[] arr) {
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// return false;
// }
// }
// return true;
// }

// // Check if array is sorted in descending order
// public static boolean isSortedDescending(int[] arr) {
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] < arr[i + 1]) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter number of elements: ");
// int n = sc.nextInt();

// int[] arr = new int[n];
// System.out.println("Enter " + n + " elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println("\nOriginal Array:");
// printArray(arr);

// // Analyze case based on input
// if (isSortedAscending(arr)) {
// System.out.println("Input Case: BEST CASE (Array already sorted)");
// } else if (isSortedDescending(arr)) {
// System.out.println("Input Case: WORST CASE (Array sorted in reverse order)");
// } else {
// System.out.println("Input Case: AVERAGE CASE (Random order)");
// }

// // Perform Selection Sort
// selectionSort(arr);

// System.out.println("\nSorted Array:");
// printArray(arr);

// // Complexity explanation
// System.out.println("\nTime Complexity Justification:");
// System.out
// .println("Time complexity for this input: O(n^2) (Selection Sort always scans
// the remaining elements)");
// // System.out.println(" - Best Case: O(n^2) (Selection Sort always scans full
// // array even if sorted)");
// // System.out.println(" - Worst Case: O(n^2) (Still performs same
// comparisons,
// // just more swaps)");
// // System.out.println(" - Average Case: O(n^2) (Random order still leads to
// // ~n^2/2 comparisons)");
// sc.close();
// }
// }

import java.util.*;

public class DetectCaseAndComplexity {

    enum OrderCase {
        BEST, WORST, AVERAGE
    }

    // ----- Helpers to detect input order -----
    static boolean isSortedAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            if (a[i] > a[i + 1])
                return false;
        return true;
    }

    static boolean isSortedDescending(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            if (a[i] < a[i + 1])
                return false;
        return true;
    }

    static OrderCase detectCase(int[] a) {
        if (isSortedAscending(a))
            return OrderCase.BEST;
        else if (isSortedDescending(a))
            return OrderCase.WORST;
        else
            return OrderCase.AVERAGE;
    }

    static void printArray(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }

    // ----- Bubble Sort (for sorting output) -----
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("\nOriginal array:");
        printArray(arr);

        // Detect input pattern once
        OrderCase inputCase = detectCase(arr);

        // Bubble Sort: complexity depends on order
        System.out.println("\nBubble Sort:");
        String bubbleComplexity;
        if (inputCase == OrderCase.BEST) {
            bubbleComplexity = "O(n) (Array already sorted)";
        } else {
            // both reverse-sorted and random behave quadratic
            bubbleComplexity = "O(n^2) (needs multiple passes with swaps/comparisons)";
        }
        System.out.println("Detected input case: " + inputCase);
        System.out.println("Time complexity for this input: " + bubbleComplexity);

        // ---- Show sorted arrays (optional) ----
        int[] a2 = Arrays.copyOf(arr, arr.length);
        bubbleSort(a2);

        System.out.println("Sorted (Bubble Sort):");
        printArray(a2);

        sc.close();
    }
}