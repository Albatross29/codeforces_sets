import java.util.Scanner;

/*
    Author: Albatross
    Date: 22.10.2020
 */

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), remainingTime = 240 - k, solutions = 0;
        for(int i = 1; i <= n; i++) {
            if(remainingTime-5*i >= 0) {
                remainingTime -= 5*i;
                solutions++;
            }
        }
        System.out.println(solutions);
    }
}