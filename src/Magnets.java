import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int magnets = Integer.parseInt(in.nextLine()), groups = 1;
        String[] magnetArray = new String[magnets];
        for(int i = 0; i < magnetArray.length; i++) {
            magnetArray[i] = in.nextLine();
            if(i > 0) {
                if(!magnetArray[i].equals(magnetArray[i - 1]))
                    groups++;
            }
        }
        System.out.println(groups);
    }
}