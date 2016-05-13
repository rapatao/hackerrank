package hackerrank.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class UtopianTree {

    private Scanner scanner = new Scanner(System.in);

    public void execute(final String[] args) {
        int tests = nextInt();
        for (int i = 0; i < tests; i++) {
            int cycles = nextInt();

            int height = 1;
            for (int c = 0; c < cycles; c++) {
                height = (c % 2 == 0) ? height * 2 : height + 1;
            }
            print(height);

        }
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final int result) {
        System.out.println(result);
    }

}
