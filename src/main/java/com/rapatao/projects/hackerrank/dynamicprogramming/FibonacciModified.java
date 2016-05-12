package com.rapatao.projects.hackerrank.dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 12/05/2016
 */
public class FibonacciModified {

    private Scanner scanner = new Scanner(System.in);

    public void execute() {
        int p1 = nextInt(), p2 = nextInt(), px = nextInt();

        BigInteger[] ar = new BigInteger[px];
        ar[0] = new BigInteger(String.valueOf(p1));
        ar[1] = new BigInteger(String.valueOf(p2));
        for (int i = 1; i < ar.length - 1; i++) {
            ar[i + 1] = ar[i].pow(2).add(ar[i - 1]);
        }
        print(ar[px - 1]);
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    public void print(final BigInteger value) {
        System.out.println(value.toString());
    }

}
