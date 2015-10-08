package com.java24hours;

/* date: Oct 1, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 12 - Objects
 */

import java.util.*;

public class StringLister {
    String[] names = {"Picard", "Riker", "Data", "Geordi", "Worf", "Troi"};
    
    public StringLister(String[] moreNames) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(names));
        list.addAll(Arrays.asList(moreNames));
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {
        StringLister lister = new StringLister(args);
    }
}
