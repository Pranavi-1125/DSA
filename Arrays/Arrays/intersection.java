import java.util.ArrayList;
import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements1: ");
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter size2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements2: ");
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a1[i] == a2[j]) {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != a1[i]) {
                    arr.add(a1[i]);
                }
                i++;
                j++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Intersection of the two arrays is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
