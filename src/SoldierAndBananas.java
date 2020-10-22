import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        String[] array = new Scanner(System.in).nextLine().split(" ");
        int cost = 0;
        for(int i = 1; i <= Integer.valueOf(array[2]); i++) {
            cost += i*Integer.valueOf(array[0]);
        }
        if(cost - Integer.valueOf(array[1]) <= 0)
            System.out.println(0);
        else
            System.out.println(cost - Integer.valueOf(array[1]));
    }
}