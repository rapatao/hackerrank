package com.rapatao.projects.hackerrank.implementation;

import java.util.Scanner;

/**
 * @author Luiz Henrique Rapatao - rapatao@rapatao.com
 * @since 11/05/2016
 */
public class AngryProfessor {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new AngryProfessor().execute(args);
    }

    public void execute(String[] args) {
        int testCases = readInt();

        for (int i = 0; i < testCases; i++) {

            int students = readInt();
            int cancellation = readInt();

            int present = 0;
            for (int s = 0; s < students; s++) {
                int enterTime = readInt();
                if (enterTime <= 0) {
                    present += 1;
                }
            }
            System.out.println((present < cancellation) ? "YES" : "NO");
        }

    }

    public int readInt() {
        return scanner.nextInt();
    }

}
