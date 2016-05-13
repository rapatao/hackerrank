package hackerrank.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class Staircase {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            char[] blank = new char[len - (i + 1)];
            char[] hash = new char[i + 1];
            Arrays.fill(blank, ' ');
            Arrays.fill(hash, '#');
            System.out.print(new String(blank) + new String(hash) + "\n");
        }

    }

}
