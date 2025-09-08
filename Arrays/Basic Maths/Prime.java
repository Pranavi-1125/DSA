import java.util.Scanner;
import java.lang.Math;

class Prime{
public static void main(String args[]){
System.out.print("Enter a num: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
print(n);
}


//TC is O(n)
/*static void print(int n){
int count = 0;
for (int i = 1; i<= n; i++){
	if(n%i == 0){
		count++;
	}
}
if(count == 2)
	System.out.println(n+" is a Prime no");
else
System.out.println(n+" is not a Prime no");
}
}*/


//TC is O(sqrt(n))
static void print(int n){
int count = 0;
for (int i = 1; i<= Math.sqrt(n); i++){
	if(n%i == 0){
		count++;
		if((n/i) != i)
			count++;
	}
}
if(count == 2)
	System.out.println(n+" is a Prime no");
else
System.out.println(n+" is not a Prime no");
}
}
