// TC - O(n^2)
// SC - O(1)

// public class twoSum {
//     public static void main(String[] args) {
//         int[] arr = { 2, 6, 5, 8, 11 };
//         int k = 14;
//         int sum = 0;
//         String tf = "No";
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 if (i != j) {
//                     sum = arr[i] + arr[j];
//                 }
//                 if (sum > k || sum < k) {
//                     sum = 0;
//                 }
//                 if (sum == k) {
//                     tf = "Yes";
//                     System.out.println(i + " " + j);
//                     break;
//                 }
//             }
//             if (tf == "Yes") {
//                 break;
//             }

//         }
//         System.out.println(tf);
//     }
// }

// TC - O(nLogn)
// SC - O(n)

// import java.util.HashMap;

// public class twoSum {
//     public static void main(String[] args) {
//         int[] arr = { 2, 6, 5, 8, 11 };
//         int k = 14;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int val = 0;
//         String tf = "No";
//         for (int i = 0; i < arr.length; i++) {
//             val = k - arr[i];
//             if (map.containsKey(val)) {
//                 tf = "Yes";
//                 System.out.println(map.get(val) + " " + i);
//                 break;
//             }
//             map.put(arr[i], i);
//         }
//         System.out.println(tf);
//     }
// }

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        // int[] arrSorted = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = 14;
        int left = 0;
        int right = arr.length - 1;
        String tf = "No";
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > k) {
                right--;
                sum = 0;
            } else if (sum < k) {
                left++;
                sum = 0;
            } else {
                tf = "Yes";
                System.out.println(left + " " + right);
                break;
            }
        }
        System.out.println(tf);
    }
}
