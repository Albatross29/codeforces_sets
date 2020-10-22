import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] array = new String[n];
        for(int i = 0; i < n; i++) {
            String s = in.nextLine();
            if(s.length() > 10) {
                char[] h = s.toCharArray();
                s = String.valueOf(h[0]) + String.valueOf(h.length - 2) + String.valueOf(h[h.length -1]);
            }
            array[i] = s;
        }
        for(String st : array) {
            System.out.println(st);
        }
    }
}