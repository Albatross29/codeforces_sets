import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        boolean first = true;
        for(int i = 0; i < n; i++) {
            if(i%2 == 0) {
                System.out.println("#".repeat(m));
            }
            else {
                if(first) {
                    System.out.println(".".repeat(m - 1) + "#");
                    first = false;
                }
                else {
                    System.out.println("#" + ".".repeat(m - 1));
                    first = true;
                }
            }
        }
    }
}