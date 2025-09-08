// 5. Sum of first N numbers

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(Add(n));

        sc.close();
    }

    public static int Add(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + Add(n - 1);
        }
    }

}

// Strivers
// import java.util.Scanner;

// public class Sum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number: ");
// int n = sc.nextInt();
// int i = 0;
// Add(n, i);

// sc.close();
// }

// public static void Add(int n, int sum) {
// if (n < 1) {
// System.out.println(sum);
// return;
// } else {
// Add(n - 1, sum + n);
// }
// }

// }
