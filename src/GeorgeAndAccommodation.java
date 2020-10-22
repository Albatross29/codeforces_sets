import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rooms = in.nextInt(), available = 0;
        for(int i = 0; i < rooms; i++) {
            int p = in.nextInt(), q = in.nextInt();
            if (p+2 <= q)
                available++;
        }
        System.out.println(available);
    }
}