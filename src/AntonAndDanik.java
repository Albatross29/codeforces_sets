import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int games = Integer.parseInt(in.nextLine()), danik = 0, anton = 0;
        char[] winners = in.nextLine().toCharArray();
        for(char ch : winners) {
            if(ch == 'D')
                danik++;
            else
                anton++;

            if(danik > games/2) {
                System.out.println("Danik");
                return;
            }
            else if(anton > games/2) {
                System.out.println("Anton");
                return;
            }
        }
        System.out.println("Friendship");
    }
}