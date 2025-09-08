// Hashing - Pre-storing and fetching
//Takes no of inputs, array, no of inputs to check, nums that need to be checked
// Gives out how many occurrences does that each num occur

import java.util.Scanner;

class IntHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        int num = 0;
        System.out.println("Enter how many need to be checked: ");
        int q = sc.nextInt();
        System.out.println("Enter numbers to be checked: ");
        while (q > 0) {
            num = sc.nextInt();
            System.out.println(hash[num]);
            q--;
        }

        sc.close();
    }
}