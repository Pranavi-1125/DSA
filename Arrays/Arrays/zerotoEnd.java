
// // My approach - brute force
// // count non zero elements and store in temp
// // insert all non zero elements at the beginning of the array
// // make rest of the elements to zero

// // TC - O(n)
// // SC - O(temp) and O(n) when worst case
// import java.util.Scanner;

// public class zerotoEnd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int[] a1 = new int[n];
//         // Making all the non-zero elements to the beginning of the array
//         int j = 0;
//         for (int i = 0; i < n; i++) {
//             if (a[i] != 0) {
//                 a1[j] = a[i];
//                 j++;
//             }
//         }

//         System.out.println("---------------------------------------");
//         for (int num : a1)
//             System.out.print(" " + num);
//         sc.close();
//     }
// }

// Optimal solution

import java.util.Scanner;

public class zerotoEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j >= 0)
            for (int i = j + 1; i < n; i++) {
                if (a[i] != 0) {
                    int t = a[i];
                    a[i] = 0;
                    a[j] = t;
                    j++;
                }
            }

        System.out.println("---------------------------------------");
        for (int num : a)
            System.out.print(" " + num);
        sc.close();
    }
}
