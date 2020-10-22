import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().toCharArray();
        int characters = chars.length;
        int distinct = 0;
        boolean counted = false;
        for(int i = 0; i < chars.length; i++) {
            counted = false;
            for(int j = i + 1; j < chars.length; j++) {
                if(chars[j] != '0' && chars[i] == chars[j] && counted == false) {
                    distinct++;
                    chars[i] = '0';
                    chars[j] = '0';
                    counted = true;
                }
            }
        }
        if((characters-distinct)%2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}