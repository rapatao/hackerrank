package com.rapatao.projects.hackerrank.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/find-digits
 *
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class FindDigits {

    private Scanner scanner = new Scanner(System.in);

    public void execute(final String[] args) {
        int tests = nextInt();
        for (int i = 0; i < tests; i++) {
            int val = nextInt();
            String str = String.valueOf(val);
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                final int digit = Integer.parseInt(new String(new char[] {str.charAt(j)}));
                if (digit > 0 && val % digit == 0) {
                    sum++;
                }
            }
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
