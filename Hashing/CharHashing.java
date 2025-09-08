import java.util.Scanner;

class CharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            arr[i] = input.charAt(0);
        }
        int hash[] = new int[26];

        for (int i = 0; i < n; i++) {
            hash[arr[i] - 'a'] += 1;
        }
        char num;
        System.out.println("Enter how many need to be checked: ");
        int q = sc.nextInt();
        System.out.println("Enter chars to be checked: ");
        while (q > 0) {
            num = sc.next().charAt(0);
            int in = num - 'a';
            System.out.println(hash[in]);
            q--;
        }

        sc.close();
    }
}