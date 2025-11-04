// arr = { 0, 1, 2, 0, 1, 2, 1, 0 }
// output: arr = { 0, 0, 0, 1, 1, 1, 2, 2 }

// Brute force appreach is sorting it by merge sort or any other sorting algorithm
// TC - O(nlogn)
// SC - O(n)

// Better approach: Counting the number of 0s, 1s and 2s and then filling the array accordingly
// TC for counting the elements is O(n) and filling the array is also O(n) so overall it is O(n) + O(n) = O(2n) which is O(n)
// TC - O(n)
// SC - O(1)

// public class sort012 {
//     public static void main(String[] args) {
//         int[] arr = { 0, 1, 2, 0, 1, 2, 1, 0 };
//         int count1 = 0;
//         // int count2 = 0;
//         int count0 = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 count0++;
//             } else if (arr[i] == 1) {
//                 count1++;
//             }
//             // else {
//             // count2++;
//             // }
//         }
//         for (int i = 0; i < count0; i++) {
//             arr[i] = 0;
//         }
//         for (int i = count0; i < count0 + count1; i++) {
//             arr[i] = 1;
//         }
//         for (int i = count0 + count1; i < arr.length; i++) {
//             arr[i] = 2;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// Optimal approach: Dutch National Flag Algorithm
// TC - O(n)
// SC - O(1)

public class sort012 {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 2, 0, 1, 2, 1, 0 };
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (low <= high && mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
