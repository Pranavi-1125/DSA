//     A    
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

import java.util.Scanner;

class part {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class pattern17 {
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

// A
// A B
// A B C
// A B C D
// A B C D E

// class part {
// void print(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// for (char ch = 'A'; ch < 'A' + i; ch++) {
// System.out.print(ch + " ");
// }
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// System.out.println();
// }
// }
// }