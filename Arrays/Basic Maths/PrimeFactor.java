import java.util.Scanner;
import java.lang.Math;

class PrimeFactor{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num: ");
int n = sc.nextInt();
prime(n);
}

static void prime(int n){
int count = 0;
	for(int i = 1; i<=n;i++){
		if(n%i == 0){
		for (int j = i; j<= Math.sqrt(n); j++){
		if(n%j == 0){
		count++;
		if((n/j) != j)
			count++;
	}}
}}
if(count == 2)
	System.out.println(n+" is a Prime no");
else
System.out.println(n+" is not a Prime no");
}
}