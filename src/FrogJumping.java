import java.util.Scanner;

public class FrogJumping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = Integer.valueOf(in.nextLine()); i > 0; i--) {
            long right = in.nextInt(), left = in.nextInt(), jumps = in.nextInt();
            if(jumps%2 == 0) {
                System.out.println((right - left)*(jumps/2));
            }
            else {
                System.out.println((right - left)*(jumps/2) + right);
            }
        }
    }
}