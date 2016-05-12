package com.rapatao.projects.hackerrank.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class SherlockAndTheBeast {

    private Scanner scanner = new Scanner(System.in);

    public void execute(final String[] args) {
        int tests = nextInt();
        for (int i = 0; i < tests; i++) {
            int n = nextInt();
            System.out.println(generate(n));
        }
    }

    public String generate(final int length) {
        String[] chars = new String[length];
        Arrays.fill(chars, "5");
        return generate(chars, chars.length - 1);
    }

    public String generate(final String[] chars,
                           final int index) {
        if (index >= 0 && index < chars.length) {
            String[] newChars = chars.clone();
            if (validate(newChars)) {
                return String.join("", newChars);
            } else {
                newChars[index] = "3";
                return generate(newChars, index - 1);
            }
        } else {
            if (validate(chars)) {
                return String.join("", chars);
            }
        }
        return "-1";
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public boolean validate(String[] number) {
        final long c3 = Arrays.stream(number).filter(c -> c.equals("3")).count();
        final long c5 = Arrays.stream(number).filter(c -> c.equals("5")).count();
        boolean valid = true;
        if (c5 > 0 && c5 % 3 != 0) {
            valid = false;
        }
        if (c3 > 0 && c3 % 5 != 0) {
            valid = false;
        }
        if (valid) {
            return true;
        }
        return false;
    }

}
