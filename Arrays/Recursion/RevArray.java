// Reversing an Array

//I did it
// import java.util.Scanner;

// public class RevArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a[] = { 1, 2, 56, 7, 8 };
//         int b[] = new int[5];
//         for (int i : a) {
//             System.out.println(i);
//         }
//         System.out.println("---------------");
//         rev(4, 0, a, b);

//         sc.close();
//     }

//     public static void rev(int n, int i, int a[], int b[]) {
//         if (n < 0 && i > 4) {
//             for (int x : b) {
//                 System.out.println(x);
//             }
//         } else {
//             b[n] = a[i];
//             rev(n - 1, i + 1, a, b);
//         }

//     }

// }

// Strivers
// public class RevArray {
//     static int a[] = { 1, 2, 56, 7, 8 };

//     public static void main(String[] args) {

//         for (int i : a) {
//             System.out.println(i);
//         }
//         System.out.println("---------------");
//         rev(0, 4);
//     }

//     public static void rev(int l, int r) {
//         if (l >= r) {
//             for (int i : a) {
//                 System.out.println(i);
//             }
//         } else {
//             swap(l, r);
//             rev(l + 1, r - 1);
//         }

//     }

//     public static void swap(int l, int r) {
//         int temp = a[l];
//         a[l] = a[r];
//         a[r] = temp;
//     } 

// }

public class RevArray {
    static int a[] = { 1, 2, 56, 7, 8 };

    public static void main(String[] args) {

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("---------------");
        rev(0, 5);

        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void rev(int i, int n) {
        if (i >= n / 2) {  // n/2 indicates that only half of the array needs to be swapped
            return;
            // for (int x : a) {
            // System.out.println(x);
            // }
        } else {
            swap(i, n - i - 1);
            rev(i + 1, n);
        }

    }

    public static void swap(int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

}
