import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int t = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + (index + 1));
        }

        sc.close();
    }

}
