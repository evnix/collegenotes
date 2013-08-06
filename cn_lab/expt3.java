/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int bits[] = new int[10];
        int i = 0;

        Scanner sc = new Scanner(System.in);
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(20);

//take ip


        System.out.print("\nEnter bits\n");
        int parity = 0;

        for (i = 0; i < 7; i++) {
            bits[i] = sc.nextInt();

            if (bits[i] == 1) {
                parity++;
            }

        }

        if (parity % 2 == 0) {
            parity = 0;
        }

        System.out.println("\np1: " + parity);


        if (r < 7) {
            if (bits[r] == 0) {
                bits[r] = 1;
            } else {
                bits[r] = 0;
            }

        }

        int parity2 = 0;

        for (i = 0; i < 7; i++) {
            if (bits[i] == 1) {
                parity2++;
            }

        }

        System.out.println("\n Rand: " + r);

        if (parity2 % 2 == 0) {
            parity2 = 0;
        }

        if (parity == parity2) {
            System.out.println("\n valid msg");
        } else {
            System.out.println("\n invalid msg");
        }


    }
}
