import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int width = 0;
        in.nextLine();
        String[] array = in.nextLine().split(" ");
        for(String s : array) {
            if(Integer.parseInt(s) <= h)
                width += 1;
            else
                width += 2;
        }
        System.out.println(width);
    }
}