// Given an array of integers and an integer k, find the length of the longest subarray with sum k.
// 1 2 3 1 1 1 
// k = 3 
// Output = 3 (1 1 1)

//Brute force
//TC ~= O(n^3)
//SC - O(1)
import java.util.Scanner;

public class longestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int p = i; p <= j; p++) {
                    sum += a[p];
                }
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        System.out.println("Max length of subarray with sum k: " + maxLength);

        sc.close();
    }
}

// Brute force
// TC - O(n^2)
// import java.util.Scanner;

// public class longestSubarray {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size: ");
// int n = sc.nextInt();
// System.out.println("Enter elements: ");
// int[] a = new int[n];
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }
// System.out.println("Enter k:");
// int k = sc.nextInt();
// int maxLength = 0;

// for (int i = 0; i < n; i++) {
// int sum = 0;
// for (int j = i; j < n; j++) {

// sum += a[j];

// if (sum == k) {
// maxLength = Math.max(maxLength, j - i + 1);
// }

// }
// }
// System.out.println("Max length of subarray with sum k: " + maxLength);

// sc.close();
// }
// }