// package Functions;

// Factorial using recursion

// import java.util.Scanner;

// public class Factorial {

//     public static int fact(int num){
//         if(num == 0 || num == 1)
//         return 1;
//         else
//         return num * fact(num-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a num: ");
//         int num = sc.nextInt();
//         System.out.printf("Factorial of %d is %d",num,fact(num));
//         sc.close();

//     }
    
// }









// Factorial without using recursion

import java.util.Scanner;

public class Factorial {

    public static int Fact(int num){
        if(num == 0 || num == 1)
            return 1;
        else{
        int f = 1 ;
        for(int i = num; i>0; i--)
            f = f * i;
        return f;
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.printf("Factorial of %d is %d",num,Fact(num) );
    }





}