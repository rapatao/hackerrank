package hackerrank.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 08/07/2016
 */
public class Kangaroo {

    private Scanner scanner = new Scanner(System.in);

    private int calcRate(int start,
                         int rate,
                         int index) {
        return start + (rate * index);
    }

    public void execute() {
        int firstStart = nextInt();
        int firstRate = nextInt();
        int secondStart = nextInt();
        int secondRate = nextInt();

        String result = "NO";
        for (int i = 1; i < 10000; i++) {
            if (calcRate(firstStart, firstRate, i) == calcRate(secondStart, secondRate, i)) {
                result = "YES";
                break;
            }
        }
        print(result);
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final String result) {
        System.out.println(result);
    }

}
