// package Functions;

// Enter 3 numbers from the user & make a function to print their average.

// import java.util.Scanner;

//  class Function_Probs{
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


// import java.util.Scanner;

// class Function_Probs{
// public static void OddSum(int num){
//     int sum = 0;
//     for(int i = 1; i<=num; i++){
//     if(i%2 != 0){
//         sum += i;
//     }
// }
//     System.out.println(sum);
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     OddSum(num);
//     sc.close();
// }

// }






// Write a function which takes in 2 numbers and returns the greater of those two.


// import java.util.Scanner;

// class Function_Probs{
//     public static int Great(int a, int b){
//         if(a>b)
//             return a;
//         else if(a == b){
//             System.out.println("Numbers are equal");
//             return 0;
//         }
//         else
//         return b;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num1: ");
//           int a = sc.nextInt();
//         System.out.print("Enter num2: ");
//         int b = sc.nextInt();
//         System.out.println("Greatest number is "+Great(a,b));
//     }
// }








// Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.Scanner;

// class Function_Probs{
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter radius: ");
//     double r = sc.nextDouble();
//     System.out.printf("Circumference of circle with %.2f is %.5f",r,Circumference(r));

// }

// public static double Circumference(double r){
//     final double PI = 3.14159;
//     return 2*PI*r;
// }
// }







// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// import java.util.Scanner;

// class Function_Probs{

// public static boolean vote(int age){
//     if(age >= 18)
//     return true;
//     return false;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your age: ");
//     int age = sc.nextInt();
//     if (vote(age) == true)
//     System.out.println("You are eligible to vote!");
//     else
//     System.out.println("You are not eligible to vote!");

// }

// }



// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

class Function_Probs{

    public static int[] Count(int num){
        int pos = 0;
        int ne = 0;
        int ze = 0;
        while (true){
            if(num > 0)
            pos++;
            else if(num < 0)
            ne++;
            else
            ze++;
        }
        int count[] = {pos,ne,ze};
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count[];
        System.out.println("Enter a number and if you wish to stop enter +");
        int num = sc.nextInt();
        while(true){
            if(num == '+')
            break;
            System.out.println("Enter a num: ");
            num = sc.nextInt();
            count = Count(num);
        }
        System.out.println("Positive: "+count[0]);
        System.out.println("Negatives: "+count[1]);
        System.out.println("Zeroes: "+count[2]);

    }
}







// Things I learned at the end of this practice

// 1. If I want to insert multiple argument in the same print statement, I can use formatted print statement i.e
//    System.out.printf("I'm %s and I'm in %dnd Year","Pranavi",2)
//                                     OR
// System.out.format("I'm %s and I'm in %dnd Year","Pranavi",2)