package com.java24hours;

class AnyRoot {
    public static void main (String[] args) {
        try
        {
            int number = Integer.parseInt(args[0]);
            System.out.println("The square root of "
            + number
            + " is "
            + Math.sqrt(number)
            );
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            System.out.println("Integer argument required.");
        }
    }
}