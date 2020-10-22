import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), amazing = 0;
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();

        int minimum = array[0], maximum = array[0];
        for(int i = 1; i < n; i++) {
            if(array[i] < minimum) {
                amazing++;
                minimum = array[i];
            }
            else if(array[i] > maximum) {
                amazing++;
                maximum = array[i];
            }
        }
        System.out.println(amazing);
    }
}