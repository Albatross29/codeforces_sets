import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        if(in.nextLine().chars().filter(ch -> ch == '1').count() > 0)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}