package hackerrank.warmup;

import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class PlusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int len = scanner.nextInt();
        if (len > 0) {
            double pos = 0, neg = 0, zer = 0;

            for (int i = 0; i < len; i++) {
                int val = scanner.nextInt();
                pos += (val > 0) ? 1 : 0;
                neg += (val < 0) ? 1 : 0;
                zer += (val == 0) ? 1 : 0;
            }
            System.out.println(pos / len);
            System.out.println(neg / len);
            System.out.println(zer / len);
        }
    }

}
