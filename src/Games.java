import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()), result = 0;
        int[] home = new int[n];
        int[] guest = new int[n];

        for(int i = 0; i < n; i++) {
            home[i] = in.nextInt();
            guest[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(home[i] == guest[j])
                    result++;

        System.out.println(result);
    }
}