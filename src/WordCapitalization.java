import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}