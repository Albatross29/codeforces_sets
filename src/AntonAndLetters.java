import java.lang.reflect.Array;
import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        if(input.equals("{}"))
            System.out.println(0);
        else {
            String[] array = input.substring(1, input.length() - 1).split(", ");
            ArrayList<String> list = new ArrayList<>();
            for (String s : array) {
                if (!list.contains(s))
                    list.add(s);
            }
            System.out.println(list.size());
        }
    }
}