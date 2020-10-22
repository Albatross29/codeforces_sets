import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int solutions = 0;
        for(int i = 0; i < n; i++) {
            if(in.nextLine().chars().filter(ch -> ch == '1').count() >= 2)
                solutions++;
        }
        System.out.println(solutions);
    }
}