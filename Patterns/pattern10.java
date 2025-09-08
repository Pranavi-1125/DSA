
// 5

// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

import java.util.Scanner;

class part {
    void print(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            // For n = 5 there are 9 rows so there are 2*n-1 rows. So we print 1 * for i = 1
            // and so on till i = n, then after n we decrease so we use 2*n-i to print the
            // rest.
            int stars = i;
            if (i > n)
                stars = (2 * n - i);
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        part obj = new part();
        int t = sc.nextInt();
        int n;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            obj.print(n);
        }
        sc.close();
    }

}

// pattern

// 5

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// import java.util.Scanner;

// class part1 {
// void print(int n) {
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// class part2 {
// void print(int n) {
// for (int i = n; i > 0; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// public class pattern10 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// part1 obj = new part1();
// part2 obj2 = new part2();
// int t = sc.nextInt();
// int n;
// for (int i = 0; i < t; i++) {
// n = sc.nextInt();
// obj.print(n);
// obj2.print(n - 1);
// }
// sc.close();
// }

// }
