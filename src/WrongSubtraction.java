import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        for(int i = 0; i < k; i++) {
            if(n%10 != 0) {
                n -= 1;
            }
            else {
                n /= 10;
            }
        }
        System.out.println(n);
    }
}