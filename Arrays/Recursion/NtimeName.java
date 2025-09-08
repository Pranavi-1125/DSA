//Question: Print name N times

//I tried this

// import java.util.Scanner;

// public class NtimeName {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = sc.nextLine();

//         System.out.println("Enter number: ");
//         int n = sc.nextInt();
//         print(n, name);
//         sc.close();

//     }

//     public static void print(int n, String name) {
//         if (n == 0) {
//             return;
//         } else {
//             System.out.println(name);
//             print(n - 1, name);
//         }

//     }
// }

//Strivers
import java.util.Scanner;

public class NtimeName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name = sc.nextLine();

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int i = 1;

        print(i, n);
        sc.close();

    }

    public static void print(int i, int n) {
        if (i > n) {
            return;
        } else {
            System.out.println("Pranavi");
            print(i + 1, n);
        }

    }
}