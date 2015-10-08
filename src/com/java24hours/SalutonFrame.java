package com.java24hours;

/* date: Oct 1, 2015
 *
 * author: Heather Khoury <hrkhoury314@gmail.com>
 *
 * project: Hour 13 - GUI
 */

import javax.swing.*;

public class SalutonFrame extends JFrame {
    
    public SalutonFrame() {
        super("Saluton mondo!");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            //ignore error
        }
    }

    public static void main(String[] args) {
        SalutonFrame frame = new SalutonFrame();
    }

}
