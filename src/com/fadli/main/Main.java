package com.fadli.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1[], x2[], temp1, temp2, x, y = 0, hasil;
        x1 = new int[3];
        x2 = new int[3];

        System.out.println("PROGRAM LINIER 2 VARIABEL");

        for (int i = 0; i < 2; i++) {
            System.out.println("Persamaan " + (i+1));
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("Masukkan Koofisien x : ");
                } else if (j == 1) {
                    System.out.print("Masukkan Koofisien y : ");
                } else {
                    System.out.print("Masukkan Nilai : ");
                }

                if (i == 0) {
                    x1[j] = sc.nextInt();
                } else {
                    x2[j] = sc.nextInt();
                }
            }
            System.out.println("");
        }

        temp1 = x1[0];
        temp2 = x2[0];

        for (int i = 1; i < 3; i++) {
            x1[i] *= temp1;
            x2[i] *= temp2;

            if (i == 1){
                y = x2[i] + x1[i];
            } else {
                hasil = x2[i] + x1[i];
            }
        }

        x = x1[2] - x1[1] * y;

        System.out.println("x : " + x + " & y : " + y);
    }
}
