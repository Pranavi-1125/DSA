//     *    
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

//Takes t as input on how many patterns and takes t times output for printing
import java.util.Scanner;

class part1 {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class part2 {
    public void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class pattern9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        part1 obj = new part1();
        part2 obj2 = new part2();
        int t = sc.nextInt();
        int n;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            obj.print(n);
            obj2.print2(n);
        }
        sc.close();
    }
}