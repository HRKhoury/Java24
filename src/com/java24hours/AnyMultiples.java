package com.java24hours;

/* date: Sep 13, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 8 - Loops (modified activity 2)
 */

public class AnyMultiples {

    public static void main(String[] args) {
        // Find x number of multiples of y
        try
        {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            for (int i = 1; i <= x; i++) {
                int multiple = y * i;
                System.out.print(multiple + " ");
            }
        System.out.println();
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            System.out.println("Integer argument required.");
        }
    }
}
