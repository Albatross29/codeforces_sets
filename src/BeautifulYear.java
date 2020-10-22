import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        boolean found = false;
        boolean einGleicher = false;
        while(!found) {
            einGleicher = false;
            year++;
            char[] yearArray = String.valueOf(year).toCharArray();
            for(int i = 0; i < yearArray.length; i++) {
                for(int j = i+1; j < yearArray.length; j++) {
                    if(!einGleicher && yearArray[i] == yearArray[j]) {
                        einGleicher = true;
                    }
                }
            }
            if(!einGleicher)
                found = true;
        }
        System.out.println(year);
    }
}