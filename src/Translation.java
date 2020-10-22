import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(), t = in.nextLine();
        if(s.charAt(0) == t.charAt(t.length()-1)) {
            StringBuilder sb = new StringBuilder().append(t).reverse();
            if (s.equals(sb.toString()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}