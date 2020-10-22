import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        int distance = new Scanner(System.in).nextInt();
        int steps = 0;
        int step = 5;
        while(distance > 0) {
            if(distance >= step) {
                steps++;
                distance -= step;
            }
            else {
                step--;
            }
        }
        System.out.println(steps);
    }
}