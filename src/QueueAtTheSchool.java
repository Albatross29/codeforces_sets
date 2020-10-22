import java.util.Arrays;
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        in.nextLine();
        char[] queue = in.nextLine().toCharArray();
        for(int i = 0; i < t; i++) {
            for(int j = 0; j < queue.length - 1; j++) {
                if(queue[j] == 'B' && queue[j+1] == 'G') {
                    queue[j] = 'G';
                    queue[j + 1] = 'B';
                    j++;
                }
            }
        }

        for(char ch : queue)
            System.out.print(ch);
    }
}