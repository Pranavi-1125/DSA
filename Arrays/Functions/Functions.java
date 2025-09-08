
// // Type ]of functions 
// // --> Void - which doesnt return anything
// import java.util.Scanner;

// class FUnctions{
// // public static int sum(int n1, int n2){
// //     int sum = n1+n2;
// //     return sum;
// // }
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         int n1 = sc.nextInt();
// //         int n2 = sc.nextInt();
// //         System.out.println("Sum "+sum(n1,n2));
// //         sc.close();

// //     }

// public static int factorial(int num){
//     // if (num == 0 || num ==1){
//     //     return 1;
//     // }
//     // else
//     //     return num*factorial(num-1);
    
//     if (num == 0 || num == 1){
//         return 1;
//     }
//     else{
//         int fact = 1;
//         for(int i = num; i>1;i--){
//             fact = fact * i;
//         }
//         return fact;
//     }



// }

// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     System.out.println("Factorial :"+factorial(num));
//     sc.close();
// }
// }




// Enter 3 numbers from the user & make a function to print their average.

// import java.util.Scanner;

// class FUnctions{
//     public static int average(int a, int b, int c){
//         int sum = a+b+c;
//         return sum/3;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println("Avg: "+average(a,b,c));
        

//     }
// }


// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

class FUnctions{
public static void OddSum(int num){
    int sum = 0;
    for(int i = 1; i<=num; i++){
    if(i%2 != 0){
        sum += i;
    }
}
    System.out.println(sum);
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    OddSum(num);
    sc.close();
}

}