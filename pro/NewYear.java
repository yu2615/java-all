import java.lang.String;
import java.lang.System;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_YEAR;

public class NewYear {
    public static void main(String[] A00) {
        Calendar L00 = Calendar.getInstance();
        int L01 = L00.get(DAY_OF_YEAR);
        int L02 = L00.getActualMaximum(DAY_OF_YEAR);
        
        System.out.printf("‚ ‚Æ%d‰ñQ‚é‚ÆA‚¨³ŒB%n", L02 - L01 + 1);
    }
}
