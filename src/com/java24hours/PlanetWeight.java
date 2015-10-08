package com.java24hours;

/* date: Sep 13, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 5 - Expressions
 */

public class PlanetWeight {

    public static void main(String[] args) {
        // Calculate a person's weight on various planets
        System.out.print("Your weight on Earth is ");
        double weight = 178;
        System.out.println(weight);
        
        System.out.print("Your weight on Mercury is ");
        double mercury = weight * 0.378;
        System.out.println(mercury);
        
        System.out.print("Your weight on Jupiter is ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}
