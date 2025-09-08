
class printingNtime {
    public static void main(String[] args) {
        int n = 1;
        printN(n);
    }

    public static void printN(int n) {
        if (n == 4) {
            return;
        } else {
            System.out.println(n);
        }
        printN(n + 1);
    }
}