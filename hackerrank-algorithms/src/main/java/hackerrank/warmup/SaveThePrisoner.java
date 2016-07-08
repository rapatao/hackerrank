package hackerrank.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 08/07/2016
 */
public class SaveThePrisoner {

    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        int cases = nextInt();

        for (int i = 0; i < cases; i++) {
            int prisoners = nextInt();
            int sweets = nextInt();
            int prisonerId = nextInt();

            int poison = prisonerId + sweets - 1;
            int prisonersInc = poison / prisoners;

            int result = poison - (prisoners * prisonersInc);

            print(result > 0 ? result : prisoners);
        }

    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final int result) {
        System.out.println(result);
    }

}
