
// 5

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

import java.util.Scanner;

class part {
    void print(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

public class pattern13 {
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

// While figuring out this one, i have found something else instead soo just
// documenting here

// 5

// 1
// 2 3
// 3 4 5
// 4 5 6 7
// 5 6 7 8 9

// class part {
// void print(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print((j + i - 1) + " ");
// }
// System.out.println();
// }
// }
// }
