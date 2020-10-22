import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        String[] littleX = in.nextLine().split(" ");
        String[] littleY = in.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(littleX));
        list.addAll(Arrays.asList(littleY));
        boolean contain = true;
        while(n > 0 && contain) {
            if(!list.contains(String.valueOf(n))) {
                contain = false;
            }
            n--;
        }
        if(contain == false)
            System.out.println("Oh, my keyboard!");
        else
            System.out.println("I become the guy.");
    }
}