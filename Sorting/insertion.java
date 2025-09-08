
import java.util.*;

class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertion_sort(arr, n);
        System.out.println("------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

        sc.close();
    }

    public static void insertion_sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void check(int[] a, int n) {
        if (a == sorted(a)) {

        }
    }

}