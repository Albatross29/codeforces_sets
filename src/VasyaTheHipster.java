import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), counter = 0;
        while(a > 0 && b > 0) {
            a--;
            b--;
            counter++;
        }
        int x = a > b ? a/2 : b/2;
        System.out.println(counter + " " + x);
    }
}