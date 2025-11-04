// Given an array of integers and an integer k, find the length of the longest subarray with sum k.
// 1 2 3 1 1 1 
// k = 3 
// Output = 3 (1 1 1)

//Brute force
//TC ~= O(n^3)
//SC - O(1)
// import java.util.Scanner;

// public class longestSubarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter k:");
//         int k = sc.nextInt();
//         int maxLength = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int sum = 0;
//                 for (int p = i; p <= j; p++) {
//                     sum += a[p];
//                 }
//                 if (sum == k) {
//                     maxLength = Math.max(maxLength, j - i + 1);
//                 }
//             }
//         }
//         System.out.println("Max length of subarray with sum k: " + maxLength);

//         sc.close();
//     }
// }

// Brute force
// TC - O(n^2)
// import java.util.Scanner;

// public class longestSubarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter k:");
//         int k = sc.nextInt();
//         int maxLength = 0;

//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {

//                 sum += a[j];

//                 if (sum == k) {
//                     maxLength = Math.max(maxLength, j - i + 1);
//                 }

//             }
//         }
//         System.out.println("Max length of subarray with sum k: " + maxLength);

//         sc.close();
//     }
// }

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
// int len = 0;

// for (int i = 0; i < n; i++) {
// int sum = 0;
// for (int j = i; j < n; j++) {
// sum += a[j];
// // len++;
// if (sum == k) {
// len = Math.max(len, j - i + 1);
// }
// }
// }
// System.out.println("Max length of subarray with sum k: " + len);

// sc.close();
// }
// }

// import java.util.Scanner;

// class longestSubarray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter k:");
//         int k = sc.nextInt();
//         int sum = 0;
//         int max = 0;
//         for (int i = 0; i < n; i++) {
//             sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += a[j];
//                 if (sum == k) {
//                     max = Math.max(max, j - i + 1);
//                     sum = 0;
//                     break;
//                 } else if (sum > k) {
//                     sum = 0;
//                     break;
//                 }
//             }
//         }
//         System.out.println("Max length of subarray with sum k: " + max);
//         sc.close();
//     }
// }


// TC - Unordered Map and has collisions - O(n2)
// Unordered Map and no collisions - O(n)
// Ordered Map with no collisions - O(nlogn)
// SC - O(n)
import java.util.*;

class longestSubarray {
    static int longsub(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == k) {
                max = i + 1;
            } else if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] a = { 1, 2, 3, 1, 1, 4, 2, 3 };
        int[] a = { 2, 0, 0, 3 };
        int k = 3;
        System.out.println("Max length of subarray with sum k: " + longsub(a, k));
    }
}