import java.util.Scanner;

class ReverseNum {

	public static void main(String args[]) {
		ReverseNum obj = new ReverseNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		int num = obj.reversing(n);
		System.out.println("Reverse of " + n + " is " + num);
		sc.close();
	}

	public int reversing(int n) {
		int rev = 0;
		while (n > 0) {
			int p = n % 10;
			n = n / 10;
			rev = (rev * 10) + p;
		}
		return rev;
	}
}