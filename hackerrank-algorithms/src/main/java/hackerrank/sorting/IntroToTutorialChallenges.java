package hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class IntroToTutorialChallenges {

    private Scanner scanner = new Scanner(System.in);

    public void execute(final String[] args) {
        int v = nextInt();
        int n = nextInt();
        int[] ar = new int[n];
        ar = Arrays.stream(ar).map(p -> nextInt()).sorted().toArray();
        final int pos = Arrays.binarySearch(ar, v);
        print(pos);
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final int result) {
        System.out.println(result);
    }

}
