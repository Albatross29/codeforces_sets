import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong(), result = 0;
        if(n%2 == 0)
            System.out.println(n/2);
        else
            System.out.println((-1)*(n/2 + 1));
    }
}