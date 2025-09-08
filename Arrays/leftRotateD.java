
// Mine 
// The code only returns when d <= n
// TC - O(3n)
// SC - O(n)

// import java.util.Scanner;

// public class leftRotateD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         int[] a1 = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             a1[i] = a[i];
//         }
//         System.out.println("Enter d: ");
//         int d = sc.nextInt();
//         // for (int i = 0; i < n; i++) {
//         // if (i + d < n) {
//         // int t = a[i];
//         // a[i] = a[i + d];
//         // a[i + d] = t;
//         // }

//         // }

//         for (int i = 0; i < n; i++) {
//             if (d + i < n)
//                 a[i] = a[d + i];
//         }

//         for (int i = 0; i < n; i++) {
//             if ((n - d + i) < n)
//                 a[n - d + i] = a1[i];
//         }

//         System.out.println("---------------------------------------");
//         for (int i = 0; i < n; i++) {
//             System.out.print(a[i] + " ");
//         }

//         sc.close();
//     }
// }

//Strivers
// TC - O(d) +O(d) + O(n-d) 
// TC - O(n-d)
// SC - O(d)
// import java.util.Scanner;

// public class leftRotateD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];

//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter d: ");
//         int d = sc.nextInt();
//         int[] temp = new int[d];
//         for (int i = 0; i < d; i++) {
//             temp[i] = a[i];
//         }

//         for (int i = d; i < n; i++) {
//             a[i - d] = a[i];
//         }

//         for (int i = n - d; i < n; i++) {
//             a[i] = temp[i - (n - d)];
//         }

//         System.out.println("---------------------------------------");
//         for (int i = 0; i < n; i++) {
//             System.out.print(a[i] + " ");
//         }

//         sc.close();
//     }
// }

// Optimal solution
// TC - d + n - d + n
// TC - O(2n)
// SC - O(1)
import java.util.Scanner;

public class leftRotateD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        d = d % n; // In case d > n (so for ex if d = 6 for n = 5, it rotates for 5 and 5-6 = 1 so
                   // d = 1)

        // Left rotation
        reverse(a, 0, d - 1); // O(d)
        reverse(a, d, n - 1); // O(n - d)
        reverse(a, 0, n - 1); // O(n)

        // right rotation
        // reverse(a, 0, n - d - 1);
        // reverse(a, n - d, n - 1);
        // reverse(a, 0, n - 1);

        System.out.println("---------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

    static void reverse(int a[], int s, int e) {
        while (s < e) {
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
}
