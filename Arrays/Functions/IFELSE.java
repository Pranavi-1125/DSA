import java.util.Scanner;

class IFELSE{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
        if (marks <=100 && marks >= 90)
        System.out.println("Grade A");
        else if (marks <90 && marks >= 70)
        System.out.println("Grade B");
        else if (marks <70 && marks >= 50)
        System.out.println("Grade C");
        else if (marks < 50 && marks >= 35)
        System.out.println("Grade D");
        else 
        System.out.println("Fail");
    }
}