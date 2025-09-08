import java.util.Scanner;

class Divisors{
public static void main(String args[]){
System.out.print("Enter a num: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
print(n);
}

/*static void print(int n){
for(int i = 1; i<=n; i++){
if( n%i == 0)
System.out.print(i+"\t");
}}}*/

static void print(int n){
for (int i = 1; i<= Math.sqrt(n);i++){
	if(n%i == 0){
		System.out.print(i+" ");
		if( (n/i) != i)
			System.out.print((n/i)+" ");
}
}
}}