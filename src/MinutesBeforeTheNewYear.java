import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    Author: Albatross
    Date: 24.10.2020
 */

public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        Date midnight = null;
        try {
            midnight = new SimpleDateFormat("HH:mm").parse("24:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < t; i++) {
            try {
                Date checkDate = new SimpleDateFormat("HH:mm").parse(in.nextLine().replace(" ", ":"));
                long difference = midnight.getTime() - checkDate.getTime();
                System.out.println((difference/60000));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}