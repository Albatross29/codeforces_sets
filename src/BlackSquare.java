import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] calories = in.nextLine().split(" ");

        int result = 0;
        char[] strips = in.nextLine().toCharArray();

        for(char ch : strips) {
            result += Integer.parseInt(calories[Integer.parseInt(String.valueOf(ch)) - 1]);
        }

        System.out.println(result);
    }
}
