// 5

// A B C D E 
// A B C D
// A B C
// A B
// A

import java.util.Scanner;

// Striver's
class part {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

// I did it
// class part {
// void print(int n) {
// for (int i = n; i > 0; i--) {
// for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
// System.out.print(ch + " ");
// }
// System.out.println();
// }
// }
// }

public class pattern15 {
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