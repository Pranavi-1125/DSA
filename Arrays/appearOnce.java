
//My approach
// But there is a problem
//1. It will not work for negative numbers
//2. It will not work if the number is greater than or equal to n
//3. What if array size is just 4 and the elements are 119, 23, 45, 67

//Optimal
//TC - O(n) + O(n) = O(n)
//SC - O(n)
// import java.util.Scanner;

// public class appearOnce {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         int[] h = new int[n];

//         for (int i = 0; i < n; i++) {
//             h[a[i]]++;
//         }

//         for (int i = 0; i < n; i++) {
//             if (h[a[i]] == 1) {
//                 System.out.println("Element appearing once: " + a[i]);
//             }
//         }

//         sc.close();
//     }

// }

//Brute force
//Tc - O(n^2)
//SC - O(1)
// import java.util.Scanner;

// public class appearOnce {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             int num = a[i];
//             for (int j = 0; j < n; j++) {
//                 if (a[j] == num) {
//                     count++;
//                 }
//             }
//             if (count == 1)
//                 System.out.println("Element appearing once: " + num);
//             count = 0;
//         }
//         sc.close();

//     }
// }

import java.util.Scanner;

public class appearOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ a[i];
        }

        System.out.println("Element appearing once: " + xor);
        sc.close();
    }
}