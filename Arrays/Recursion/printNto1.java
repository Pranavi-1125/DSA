// // 3. Print from N to 1

//I did it
// import java.util.Scanner;

// public class printNto1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int n = sc.nextInt();
//         print(n);

//         sc.close();
//     }

//     public static void print(int n) {
//         if (n < 1) {
//             return;
//         } else {
//             System.out.println(n);
//             print(n - 1);
//         }
//     }
// }

//Strivers
import java.util.Scanner;

public class printNto1 {
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
            System.out.println(i);
            print(n, i - 1);
        }
    }
}