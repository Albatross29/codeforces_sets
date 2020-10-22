import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String message = "I hate ";
        if(n == 1)
            message += "it";
        else {
            for(int i = 1; i < n; i++) {
                if(i%2 == 0)
                    message += "that I hate ";
                else
                    message += "that I love ";
            }
            message += "it";
        }
        System.out.println(message);
    }
}