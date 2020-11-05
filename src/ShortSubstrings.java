import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.valueOf(in.nextLine());
        for(int i = 0; i < k; i++) {
            String s = in.nextLine();
            int n = 0;
            while(n < s.length()) {
                System.out.print(s.charAt(n));
                n += 2;
            }
            System.out.print(s.charAt(s.length() - 1) + System.lineSeparator());
        }
    }
}