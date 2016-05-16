package hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/service-lane
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 16/05/2016
 */
public class ServiceLane {

    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        int lanes = nextInt();
        int tests = nextInt();

        List<Integer> lanesSize = new ArrayList<>();
        for (int l = 0; l < lanes; l++) {
            lanesSize.add(nextInt());
        }

        for (int i = 0; i < tests; i++) {
            int ini = nextInt();
            int end = nextInt() + 1;
            final Optional<Integer> min = lanesSize.subList(ini, end).stream().min((o1, o2) -> o1.compareTo(o2));
            print(min.get());
        }

    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final int result) {
        System.out.println(result);
    }

}
