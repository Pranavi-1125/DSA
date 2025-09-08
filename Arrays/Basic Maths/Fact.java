import java.util.Scanner;
import java.lang.Math;

class Fact{
public static void main(String args[]){
System.out.print("Enter a num: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int fact = Factorial(n);
System.out.println("Factorial of "+n+" is "+fact);
}

static int Factorial(int n){
 if( n==0 || n ==1)
	return 1;
else 
	return n*Factorial(n-1);
}
}
 

