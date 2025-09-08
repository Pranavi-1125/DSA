import java.util.Scanner;

class Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        getNums obj = new getNums();
        System.out.println("Enter a no");
        int n = sc.nextInt();
        int num = obj.solution(n);
        System.out.println("There are " + num + " numbers in " + n);
        sc.close();
    }
}

// TC is O(log10(N)) - N divided by 10 so log10(N)
/*
 * class getNums{
 * public int solution(int n){
 * int i = 0;
 * int p = n;
 * while(p>0){
 * p = p/10;
 * i++;
 * }
 * return i;
 * }}
 */

// Another method of finding this

class getNums {
    public int solution(int n) {
        int p = (int) Math.log10(n);
        int i = p + 1;
        return i;
    }
}