import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    Author: Albatross
    Date: 24.10.2020
 */

public class BusToUdayland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        List<String> seats = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            seats.addAll(Arrays.asList(in.nextLine().split("\\|")));
        }
        if(seats.contains("OO")) {
            System.out.println("YES");
            int index = seats.indexOf("OO");
            seats.remove(index);
            seats.add(index, "++");
            int x = 0;
            for(String s : seats) {
                if(x == 0) {
                    System.out.print(s + "|");
                    x++;
                }
                else {
                    x--;
                    System.out.print(s + System.lineSeparator());
                }
            }
        }
        else
            System.out.println("NO");
    }
}