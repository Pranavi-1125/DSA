// pattern

// 5

//      *      
//     ***
//    *****
//   *******
//  *********

//Takes t as input on how many patterns and takes t times output for printing
import java.util.Scanner;

/*
//This prints 1,3,5,7,9,....stars
class part{
public void print(int n){
for(int i = 1; i<=n; i = i+2){
for(int j = 1; j<=i; j++){
System.out.print("* ");
}
System.out.println();
}}
}*/

class part {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class pattern7 {
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

// pattern

// 5

// *
// * *
// * * *
// * * * *
// * * * * *

// class part {
// void print(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }

// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// System.out.println();
// }
// }
// }
