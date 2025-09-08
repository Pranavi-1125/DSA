
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *


import java.util.Scanner;

class part {
    void print(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= (2 * n - 1); i++) {
            int stars = i;
            if (i > n)
                stars = (2 * n - i);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
            System.out.println();
        }
    }
}

public class pattern20 {
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
