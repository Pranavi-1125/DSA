
// Remove duplicates in sorted array

//Brute force solution
// TC - O(nlogn + n)
// SC - O(n)

// import java.util.HashSet;
// import java.util.Scanner;

// public class NoDuplicates {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         int a1[] = new int[n];
//         HashSet<Integer> set = new HashSet<Integer>();

//         for (int i = 0; i < n; i++) {
//             set.add(a[i]);
//         }

//         int index = 0;
//         for (Integer num : set) {
//             a1[index++] = num;
//         }

//         System.out.println("--------------------------------------------");
//         for (int i = 0; i < index; i++) {
//             System.out.println(a1[i]);
//         }
//         sc.close();
//     }
// }

// Optimal Solution
// TC - O(n)
// SC - O(1)

import java.util.Scanner;

public class NoDuplicates {
    int a[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int index = rmDuplicates(a);

        System.out.println("--------------------------------------------");
        for (int i = 0; i < index; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }

    static int rmDuplicates(int[] a) {
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[i] != a[j]) {
                a[i + 1] = a[j];
                i++;
            }
        }
        return i + 1;
    }
}
