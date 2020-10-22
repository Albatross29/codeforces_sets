import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n = participants, k = k-th place (n >= k)
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().split(" ");
        int participants = 0;
        if(Integer.valueOf(arr[0]) > 0) {
            for(String s : arr) {
                if(Integer.valueOf(s) > 0 && Integer.valueOf(s) >= Integer.valueOf(arr[k - 1])) {
                    participants++;
                }
            }
        }
        System.out.println(participants);
    }
}