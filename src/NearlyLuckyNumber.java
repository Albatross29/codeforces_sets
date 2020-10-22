import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        char[] number = new Scanner(System.in).nextLine().toCharArray();
        int[] array = new int[number.length];
        int i = 0, luckynumbers = 0;
        for(char ch : number) {
            array[i] = Integer.parseInt(String.valueOf(ch));
            if(array[i] == 4 || array[i] == 7)
                luckynumbers++;
            i++;
        }
        if (luckynumbers == 4 || luckynumbers == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}