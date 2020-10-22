import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stops = Integer.valueOf(in.nextLine());
        int current = 0;
        int maximum = 0;
        for(int i = 0; i < stops; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            in.nextLine();
            current = current - a + b;
            if(current > maximum)
                maximum = current;
        }
        System.out.println(maximum);
    }
}