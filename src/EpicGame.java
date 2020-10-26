import java.util.Scanner;

public class EpicGame {
    // TODO implement GCD method and redo the calculations
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int simon = in.nextInt(), antisimon = in.nextInt(), stones = in.nextInt(), move = 0;
        while(stones > 0) {
            if(move == 0) {
                move++;
                stones -= gcdJonas(simon, stones);
            }
            else {
                move--;
                stones -= gcdJonas(antisimon, stones);
            }
        }
        System.out.println(move == 0 ? 1 : 0);
    }

    public static long gcd(long a, long b) {
        if (a == 0)
            return b;
        else if (b == 0)
            return a;
        if (a < b)
            return gcd(a, b % a);
        else
            return gcd(b, a % b);
    }

    public static long gcdJonas(long a, long b) {
        long small = 0, large = 0;
        if(a > b) {
            large = a;
            small = b;
        }
        else {
            large = b;
            small = a;
        }

        for(long i = small; i > 1; i--) {
            if(small%i == 0 && large%i == 0)
                return i;
        }
        return 1;
    }
}