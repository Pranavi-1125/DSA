import java.util.Scanner;

//I did it
// class part {
//     void print(int n) {
//         for (char ch = 'A'; ch < (char) ('A' + n); ch++) {
//             for (char s = 'A'; s <= ch; s++) {
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Striver's
class part {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class pattern16 {
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