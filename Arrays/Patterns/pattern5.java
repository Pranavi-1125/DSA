// pattern

// 5

// * * * * * 
// * * * * 
// * * * 
// * *
// *

//Takes t as input on how many patterns and takes t times output for printing
import java.util.Scanner;

/*class part{
public void print(int n){
for(int i = n; i>=0; i--){
for(int j = i-1; j>=0; j--){
System.out.print("* ");
}
System.out.println();
}
}
}*/

class part {
    public void print(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // System.out.print(j+" ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pattern5 {
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

// class pattern5 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = n; i > 0; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }