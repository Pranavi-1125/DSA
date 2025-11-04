public class LongestSubNegative {
    static int longsub(int[] a, int k) {
        int sum = 0;
        int max = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == k) {
                max = Math.max(max, i - j + 1);
            } else if (sum > k) {
                while (sum > k && j <= i) {
                    sum -= a[j];
                    j++;
                }
                if (sum == k) {
                    max = Math.max(max, i - j + 1);
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = { 1, -2, 3, 1, 1, -2, 3 };
        int k = 6;
        System.out.println(longsub(a, k));
    }
}
