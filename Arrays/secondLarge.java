// To approach a solution in interviews always go in the order of brute force -> better -> Optimal solutions
// Brute force is something that comes to your mind soon after you see the question.
// In interviews even if you knwo the optimal solution just start with brute force in front of the interviewer.

// Here to find 2nd largest, brute force is by sorting the array and getting checking is n-2 = n-1 yes then shift to n-3 == n-1 no then 2nd large = n-3 ele
//brute force - O(NlogN)
// Sort the array using any sorting
// sec = -1;
// for(int i = 0; i<n;i++){
//     if(large > a[n-i] && a[n-i] > sec){
//         sec = a[n-i];
//     }
// }

//Better solution - O(2N)
// import java.util.Scanner;

// class secondLarge {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements: ");
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int large = a[0];
//         for (int i = 0; i < n; i++) {
//             if (a[i] > large)
//                 large = a[i];
//         }

//         int sec = -1;
//         for (int i = 0; i < n; i++) {
//             if (a[i] > sec && a[i] < large) {
//                 sec = a[i];
//             }

//         }
//         System.out.println("Second largest is: " + sec);

//         sc.close();

//     }

// }

//Optimal solution - O(N)

import java.util.Scanner;

class secondLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int large = a[0];
        int sec = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > large) {
                sec = large;
                large = a[i];
            } else if (a[i] < large && a[i] > sec) {
                sec = a[i];
            }
        }

        System.out.println("Large: " + large);
        System.out.println("Second largest: " + sec);

        sc.close();

    }

}