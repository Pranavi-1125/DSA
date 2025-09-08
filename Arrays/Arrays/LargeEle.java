import java.util.Scanner;

class LargeEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int large = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > large)
                large = a[i];
        }
        System.out.println("Large : " + large);

        sc.close();
    }
}