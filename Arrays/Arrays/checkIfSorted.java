import java.util.Scanner;

public class checkIfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (check(a)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }

        sc.close();
    }

    // Mine
    // static boolean check(int[] a) {
    // for (int i = 0; i < a.length - 1; i++) {
    // if (a[i] > a[i + 1])
    // return false;
    // }
    // return true;
    // }

    // Strivers
    static boolean check(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

}
