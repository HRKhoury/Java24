package com.java24hours;

/* date: Oct 1, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 12 - Subclasses
 */

import java.awt.*;

public class Point3D extends Point {
    public int z;
    
    //constructor
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    
    public void move(int x, int y, int z) {
        this.z = z;
        super.move(x, y);
    }
    
    public void translate(int x, int y, int z) {
        this.z += z;
        super.translate(x, y);
    }
}
