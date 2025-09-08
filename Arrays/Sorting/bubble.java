
import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr, n);

        System.out.println("-----------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }

    // My own and Jennys
    public static void bubble_sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    // Strivers
    // public static void bubble_sort(int arr[], int n) {
    // for (int i = n - 1; i >= 0; i--) {
    // for (int j = 0; j <= i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }

    // }
    // }

}
