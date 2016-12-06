package hackerrank.contests.projecteuler.euler001;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 06/12/2016
 */
public class Solution {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Solution().execute();
    }

    void execute() {
        String tests = next();
        for (int i = 0; i < Integer.parseInt(tests); i++) {
            long value = Long.parseLong(next());

            long max3 = (value % 3 == 0) ? (value / 3) - 1 : (value / 3);
            long max5 = (value % 5 == 0) ? (value / 5) - 1 : (value / 5);
            long max15 = (value % 15 == 0) ? (value / 15) - 1 : (value / 15);

            long m3 = (max3 * (3 + (max3 * 3))) / 2;
            if (max3 == 1) {
                m3 = 3;
            }
            long m5 = (max5 * (5 + (max5 * 5))) / 2;
            if (max5 == 1) {
                m5 = 5;
            }
            long m15 = (max15 * (15 + (max15 * 15))) / 2;
            if (max15 == 1) {
                m15 = 15;
            }
            print(m3 + m5 - m15);
        }
    }

    void print(final long value) {
        System.out.println(value);
    }

    String next() {
        return scanner.next();
    }

}
