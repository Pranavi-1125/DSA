import java.util.Scanner;
import java.lang.Math;

class LCM{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num1: ");
int n1 = sc.nextInt();
System.out.print("Enter a num2: ");
int n2 = sc.nextInt();

int lcm = FindGCD(n1,n2);
System.out.println(lcm);
}

static int FindGCD(int n1, int n2){
	int lcm= 0;
	for(int i = Math.min(n1,n2);i>=1;i--){
		if((n1%i == 0) && (n2%i == 0)){
			lcm = i;
		}
	}
return lcm;
}
}