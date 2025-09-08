import java.util.Scanner;

// 5
// A 
// A B
// A B C
// A B C D
// A B C D E

// I did this
// class part {
//     void print(int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print((char) (j + 65) + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// Striver's
class part {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class pattern14 {
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

// While figuring out this one, i have found something else instead soo just
// documenting here

// 5

// A
// B C
// D E F
// G H I J
// K L M N O

// class part {
// void print(int n) {
// char A = (char) 65;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print(A + " ");
// A++;
// }
// System.out.println();
// }
// }
// }