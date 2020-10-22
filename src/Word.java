import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        char[] word = new Scanner(System.in).nextLine().toCharArray();
        int lower = 0, upper = 0;
        for(char ch : word) {
            if(Character.isUpperCase(ch))
                upper++;
            else
                lower++;
        }

        if(upper > lower)
            System.out.println(String.valueOf(word).toUpperCase());
        else
            System.out.println(String.valueOf(word).toLowerCase());
    }
}