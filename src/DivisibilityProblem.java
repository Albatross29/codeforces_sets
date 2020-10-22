import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int a = in.nextInt(), b = in.nextInt();
            if(a%b != 0)
                System.out.println(b - (a%b));
            else
                System.out.println(a%b);
        }
    }
}