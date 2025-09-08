// Can't use i-1

import java.util.Scanner;

public class BacktrackNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int i = 1;
        print(n, i);

        sc.close();
    }

    public static void print(int n, int i) {
        if (i > n) {
            return;
        } else {
            print(n, i + 1);
            System.out.println(i);

        }
    }
}