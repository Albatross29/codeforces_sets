import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maximum = array[0], minimum = array[0];
        int maxPos = 0, minPos = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] <= minimum) {
                minimum = array[i];
                minPos = i;
            }
            else if(array[i] >= maximum) {
                maximum = array[i];
                maxPos = i;
            }
        }
        int switches = (array.length - 1)-minPos + maxPos;
        if(maxPos < minPos)
            System.out.println(switches);
        else
            System.out.println(switches - 1);
    }
}