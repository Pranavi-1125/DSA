// import java.util.Scanner;

// public class missing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter Number: ");
//         int N = sc.nextInt();
//         int t = 1;
//         int index = -1;
//         if (N <= n)
//             for (int i = 0; i < n; i++) {
//                 if (t == a[i])
//                     t++;
//                 else {
//                     index = t;
//                 }
//             }
//         if (index == -1) {
//             System.out.println("The given number is greater than the given array size");
//         } else
//             System.out.println(index + " is missing");

//         sc.close();
//     }
// }

//Brute force approach
//TC - O(n^2)
//SC - O(1)

// import java.util.Scanner;

// public class missing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter Number: ");
//         int N = sc.nextInt();
//         for (int i = 1; i < N; i++) {
//             int flag = 0;
//             for (int j = 0; j < n; j++) {
//                 if (a[j] == i) {
//                     flag = 1;
//                     break;
//                 }
//             }
//             if (flag == 0)
//                 System.out.println(i + " is missing");

//         }

//         sc.close();
//     }
// }

//Optimal 

import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Number: ");
        int N = sc.nextInt();
        int[] h = new int[N + 1];
        // int t = 1;
        for (int i = 0; i < n; i++) {
            // if (a[i] == t) {
            h[a[i]] = 1;
            // } else
            // continue;
            // }
        }

        for (int i = 1; i < N; i++) {
            if (h[i] == 0) {
                System.out.println(i + " is missing");
            }
        }

        sc.close();
    }
}