package com.java24hours;

/* date: Sep 13, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 8 - Loops (activity 2)
 */

public class Multiples {

    public static void main(String[] args) {
        // Find the first 400 numbers that are multiples of 13
        for (int i = 1; i <= 400; i++) {
            int multiple = 13 * i;
            System.out.print(multiple + " ");
        }
        System.out.println();
    }
}