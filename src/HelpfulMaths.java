import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = in.nextLine().split("\\+");
        Arrays.sort(array);
        String sorted = "";
        for(String s : array) {
            sorted += s + "+";
        }
        System.out.println(sorted.substring(0, sorted.length() - 1));
    }
}