import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] number1 = in.nextLine().toCharArray();
        char[] number2 = in.nextLine().toCharArray();
        String solution = "";
        for(int i = 0; i < number1.length; i++) {
            if(number1[i] != number2[i])
                solution += "1";
            else
                solution += "0";
        }
        System.out.println(solution);
    }
}