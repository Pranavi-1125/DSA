import java.util.Scanner;
// import java.lang.Math;

class GCD {
	public static void main(String args[]) {

		GCD obj = new GCD();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n1 and n2");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int num = obj.FindGCD(n1, n2);
		System.out.println("GCD of " + n1 + " & " + n2 + " is " + num);
		sc.close();
	}

	// This is what i did
	public int FindGCD(int n1, int n2) {
		int num, gcd = 0;
		if (n1 > n2)
			num = n2;
		else
			num = n1;
		for (int i = 1; i <= num; i++) {
			if ((n1 % i == 0) && (n2 % i == 0))
				gcd = i;
		}
		return gcd;
	}
}

// Another way
/*
 * public int FindGCD(int n1, int n2){
 * int gcd= 0;
 * for(int i = 1; i<=Math.min(n1,n2);i++){
 * if((n1%i == 0) && (n2%i == 0))
 * gcd = i;
 * }
 * return gcd;
 * }
 * }
 */

// Another way with better TC
/*
 * public int FindGCD(int n1, int n2){
 * int gcd= 0;
 * for(int i = Math.min(n1,n2);i>=1;i--){
 * if((n1%i == 0) && (n2%i == 0)){
 * gcd = i;
 * break;
 * }
 * }
 * return gcd;
 * }
 * }
 */

// Here in any way, the TC will O(min(n1,n2))
// For ex, n1 =9 & n2 = 12 then O(9)

// Euclidean Algorithm: this method gives 0(log(min(n1,n2))) which is less than
// above

// I did this in recursion
/*
 * public int FindGCD(int n1, int n2){
 * if(n2>n1){
 * int temp = n1;
 * n1 = n2;
 * n2 = temp;
 * }
 * if (n2 == 0)
 * return n1;
 * else{
 * return FindGCD(n1%n2,n2);
 * }
 * }
 * }
 */

// public int FindGCD(int n1, int n2){
// while(n1>0 && n2>0){
// if(n1>n2)
// n1%=n2;
// else
// n2%=n1;
// }

// if(n1==0)
// return n2;
// else
// return n1;
// }
// }
