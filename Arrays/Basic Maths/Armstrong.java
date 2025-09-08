import java.util.Scanner;
import java.lang.Math;

class Armstrong{
public static void main(String args[]){
System.out.print("Enter a num: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num = Check(n);
if (num == 0)
	System.out.println(n+" is not an Armstrong number");
else
	System.out.println(n+" is an Armstrong number");

}

static int Check(int num){
int n = num;
int i = 0;
int LD;
int sum = 0;

while(n>0){
n = n/10;
i++;
}

n = num;
while(n>0){
LD = n%10;
n = n/10;
sum += Math.round(Math.pow(LD,i));
}
if (num == sum) 
return 1;
else
return 0;
}
}