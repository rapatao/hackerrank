package com.rapatao.projects.hackerrank.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 13/05/2016
 */
public class SherlockAndSquares {

    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        int tests = nextInt();
        for (int t = 0; t < tests; t++) {
            int a = nextInt();
            int b = nextInt();
            int sum = (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;
            print(sum);
        }
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final int result) {
        System.out.println(result);
    }

}
