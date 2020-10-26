import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int disks = Integer.valueOf(in.nextLine());
        String[] original = in.nextLine().split("");
        String[] open = in.nextLine().split("");

        int result = 0;

        for(int i = 0; i < disks; i++) {
            int one = Integer.valueOf(original[i]);
            int two = Integer.valueOf(open[i]);
            if(one != two) {
                if(Math.abs(one - two) == 5) {
                    result += 5;
                }
                else {
                    if(Math.abs(one - two) > 5) {
                        result += 10 - Math.abs(one - two);
                    }
                    else {
                        result += Math.abs(one - two);
                    }
                }
            }
        }
        System.out.println(result);
    }
}