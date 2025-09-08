// pattern

// 5

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

//Takes t as input on how many patterns and takes t times output for printing
import java.util.Scanner;

class part {
    public void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class pattern4 {
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

// class pattern4 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }
// System.out.println();
// }
// }
// }
