import java.util.Scanner;

public class XORwice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        while(n-- >= 1) {
            int a = in.nextInt();
            int b = in.nextInt();
            /*
                XOR Operation:
                if a = 6 and b = 12:
                6 = 0110
                12 = 1100
                XOR(0110 & 1100) = 1010 -> 10
             */
            System.out.println(a^b);
            in.nextLine();
        }
    }
}