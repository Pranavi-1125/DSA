// pattern

// 4

// 1             1
// 1 2         2 1
// 1 2 3     3 2 1
// 1 2 3 4 4 3 2 1

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

// So this is what i have tried and below one is striver's

import java.util.Scanner;

// class part {
//     void print(int n) {
//         // int j;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             for (int j = 1; j <= ((2 * n) - (2 * i)); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }

//             System.out.println();
//         }
//     }
// }

//Striver's
class part {
    void print(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }
}

public class pattern12 {
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