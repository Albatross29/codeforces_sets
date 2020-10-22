import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limak = in.nextInt();
        int bob = in.nextInt();
        in.nextLine();
        int years = 0;
        while(limak <= bob) {
            limak *= 3;
            bob *= 2;
            years++;
        }
        System.out.println(years);
    }
}