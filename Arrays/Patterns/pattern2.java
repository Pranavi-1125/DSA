// t = how many 
// n = size of the pattern

// 2
// 5

// *
// * * 
// * * *
// * * * * 
// * * * * *

// 3
// * 
// * *
// * * *

// //Takes t as input on how many patterns and takes t times output for printing
import java.util.Scanner;

class part {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pattern2 {
    public static void main(String args[]) {
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

// import java.util.Scanner;

// class pattern2 {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }