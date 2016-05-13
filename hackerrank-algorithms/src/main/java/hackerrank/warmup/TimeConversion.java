package hackerrank.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class TimeConversion {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            SimpleDateFormat inputPattern = new SimpleDateFormat("hh:mm:ssa");
            final Date parsedDate = inputPattern.parse(scanner.next());

            SimpleDateFormat outputPattern = new SimpleDateFormat("HH:mm:ss");
            String output = outputPattern.format(parsedDate);

            System.out.println(output);
        } catch (ParseException e) {
        }
    }

}
