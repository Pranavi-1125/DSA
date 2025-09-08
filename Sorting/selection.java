import java.util.Scanner;

class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selection_sort(arr, n);

        System.out.println("-----------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    public static void selection_sort(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int small = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            swap(arr, i, small);
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}