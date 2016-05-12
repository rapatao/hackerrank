package com.rapatao.projects.hackerrank.warmup;

import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class DiagonalDifference {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int len = scanner.nextInt();

        int[][] matrix = new int[len][len];
        for (int x = 0; x < len; x++) {
            for (int y = 0; y < len; y++) {
                matrix[x][y] = scanner.nextInt();
            }
        }

        int el1 = 0;
        int el2 = 0;
        for (int i = 0; i < len; i++) {
            el1 += matrix[i][i];
            el2 += matrix[len - 1 - i][i];
        }
        System.out.println(Math.abs(el1 - el2));

    }

}
