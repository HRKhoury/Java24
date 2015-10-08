package com.java24hours;

/* date: Sep 20, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 9 - Arrays
 */



public class Wheel {

    public static void main(String[] args) {
        // Count letter frequency in strings
        String phrase[] = {
            "LIVE LONG AND PROSPER",
            "CLEVELAND BROWNS",
            "WHAT'S THIS BUTTON DO?",
            "I LIKE MIKE",
            "THE GAME IS AFOOT",
            "ESCHEW OBFUSCATION"
        };
        int[] letterCount = new int[26];
        // This is the book code
        /*    for (int count = 0; count < phrase.length; count++) {
        String current = phrase[count];
        char[] letters = current.toCharArray();
        for (int count2 = 0; count2 < letters.length; count2++) {
        char lett = letters[count2];
        if ((lett >= 'A')&(lett <= 'Z')) {
        letterCount[lett - 'A']++;
        }
        }
        } */
        //This is code using enhanced for loop
        for (String current : phrase) {
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ((lett >= 'A')&(lett <= 'Z')) {
                    letterCount[lett - 'A']++;
                }
            }
        } 
        for (char count = 'A'; count <= 'Z'; count++) {
            System.out.print(count + ": " +
                    letterCount[count-'A'] +
                    " ");
            if (count == 'M') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
