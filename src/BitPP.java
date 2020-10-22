import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        int number = 0;
        for(int i = 0; i < n; i++) {
            String s = in.nextLine();
            if(s.equals("X++") || s.equals("++X"))
                number++;
            else
                number--;
        }
        System.out.println(number);
    }
}