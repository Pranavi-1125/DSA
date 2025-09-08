//Checking Palindrome

import java.util.Scanner;

class CheckPalindrome {
    public static void main(String args[]) {
        CheckPalindrome obj = new CheckPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int num = obj.checkPalindrome(n);
        if (num == 1) {
            System.out.println(n + " is  a  Palindrome");
        } else
            System.out.println(n + " is not a Palindrome");
        sc.close();
    }

    public int checkPalindrome(int n) {
        int rev = 0;
        int num = n;
        while (num > 0) {
            int p = num % 10;
            num = num / 10;
            rev = (rev * 10) + p;
        }
        if (rev == n)
            return 1;
        else
            return 0;
    }
}