// 3. Print from 1 to N by using backtracking
// We ususally use i+1 to print from 1 to N
// But we should use i-1 in backtracking

import java.util.Scanner;

public class Backtrack1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        print(n, n);

        sc.close();
    }

    public static void print(int n, int i) {
        if (i < 1) {
            return;
        } else {
            print(n, i - 1);
            System.out.println(i);
        }
    }
}
