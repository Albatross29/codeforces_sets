import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), amount = 0;
        while(n > 0) {
            if(n-100 >= 0)
                n -= 100;
            else if(n-20 >= 0)
                n -= 20;
            else if(n-10 >= 0)
                n -= 10;
            else if(n-5 >= 0)
                n -= 5;
            else
                n -= 1;

            amount++;
        }

        System.out.println(amount);
    }
}