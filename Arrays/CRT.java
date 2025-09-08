public class CRT {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1 };
        int n = arr.length;

        int choco = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                choco += 1;
            }
            if (arr[i] > arr[i - 1]) {
                choco += 1;
            }
        }
        System.out.println(choco + n);
    }
}
