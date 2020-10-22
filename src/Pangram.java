import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        int appereances = 0;
        if(n < 26) {
            System.out.println("NO");
        }
        else {
            for(int i = 97; i < 123; i++) {
                int x = i;
                if(s.toLowerCase().chars().filter(ch -> ch == x).count() > 0) {
                    appereances++;
                }
            }
            if(appereances >= 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}