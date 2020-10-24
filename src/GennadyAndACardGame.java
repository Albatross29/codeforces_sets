import java.util.*;

/*
    Author: Albatross
    Date: 24.10.2020
 */

public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String card = in.nextLine();
        String[] hand = in.nextLine().split(" ");
        for(String s : hand) {
            if(s.charAt(0) == card.charAt(0) || s.charAt(1) == card.charAt(1)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}