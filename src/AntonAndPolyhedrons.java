import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()), result = 0;
        for(int i = 0; i < n; i++) {
            switch (in.nextLine().charAt(0)) {
                case 'T':
                    result += 4;
                    break;
                case 'C':
                    result += 6;
                    break;
                case 'O':
                    result += 8;
                    break;
                case 'D':
                    result += 12;
                    break;
                case 'I':
                    result += 20;
                    break;
            }
        }
        System.out.println(result);
    }
}