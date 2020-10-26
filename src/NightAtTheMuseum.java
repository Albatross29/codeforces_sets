import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO - Problem 731A
public class NightAtTheMuseum {
    public static void main(String[] args) {
        char[] word = new Scanner(System.in).nextLine().toCharArray();
        List<Character> letters = new ArrayList<>();
        for(int i = 97; i < 123; i++) {
            letters.add((char)i);
        }
        int runs = 0;
        for(char c : word) {
            if(runs == 0) {
                runs += letters.indexOf(c);
            }
            else {

            }
        }
    }
}