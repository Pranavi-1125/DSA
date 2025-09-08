
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

import java.util.Scanner;

class part {
    void print(int n) {
        int space = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }
}

public class pattern19 {
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

// I did this but its not complete
// class part {
// void print(int n) {
// for (int i = 0; i < n; i++) {
// for (int j = n; j > i; j--) {
// System.out.print("*");
// }
// for (int j = 0; j < 2 * i; j++) {
// System.out.print(" ");
// }
// for (int j = n - i; j > 0; j--) {
// System.out.print("*");
// }
// System.out.println();
// }
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print("*");
// }
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }

// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j < i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }