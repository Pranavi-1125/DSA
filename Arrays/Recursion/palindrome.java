//Checking if the given is palindrome or not

public class palindrome {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2, 1 };
        // String name = "MadaM";
        int i = 0;
        if (Palin(i, a)) {
            System.out.println(" PALIMDROME");
        } else {
            System.out.println( " NOT PALINDROME");
        }
    }

    public static boolean Palin(int i, String name) {
        if (i >= name.length() / 2) {
            return true;
        }
        if (name.charAt(i) != name.charAt(name.length() - i - 1))
            return false;
        return Palin(i + 1, name);
    }

    public static boolean Palin(int i, int a[]) {
        if (i >= a.length / 2) {
            return true;
        }
        if (a[i] != a[a.length - i - 1])
            return false;
        return Palin(i + 1, a);
    }

}
