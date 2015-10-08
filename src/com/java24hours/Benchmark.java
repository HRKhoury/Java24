package com.java24hours;

/* date: Sep 13, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 8 - Loops
 */

class Benchmark {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000;
        long index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            index++;
        }
        System.out.println(index + " loops in one minute.");
    }
}
