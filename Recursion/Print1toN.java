// 2. Print from 1 to N

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("----------------------------------");
        int i = 1;
        print(i, n);

        sc.close();
    }

    public static void print(int i, int n) {

        if (i > n) {
            return;
        } else {
            System.out.println(i);
            print(i + 1, n);
        }
    }
}
