
// Count the maximum occurance of consecutive 1's in a binary array.
// Input: [1,1,0,1,1,1]
// Output: 3

//TC - O(n)
//SC - O(1)
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        System.out.println("Maximum occurrence of consecutive 1's: " + max);

        sc.close();
    }
}
