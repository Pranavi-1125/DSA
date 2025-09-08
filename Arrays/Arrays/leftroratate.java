
// TC - O(n)
//SC - O(n) to solve the algorithm and O(1) is extra space
import java.util.Scanner;

public class leftroratate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // left rotation
        // int temp = a[0];
        // for (int i = 0; i < n - 1; i++) {
        // a[i] = a[i + 1];
        // }
        // a[n - 1] = temp;

        // Strivers
        // for (int i = 1; i < n; i++) {
        // a[i-1] = a[i];
        // }
        // a[n - 1] = temp;

        // Right rotation
        int temp = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;

        System.out.println("---------------------------------------");
        for (int num : a)
            System.out.print(" " + num);
        sc.close();
    }
}
