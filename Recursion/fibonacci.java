// Fibonacci number

// When n index is entered, it should return the fibonacci number of that index
// 2 power n is the Time Complexity

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(fibo(n - 1));
        sc.close();
    }

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}
