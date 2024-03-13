/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical4;
import javax.swing.JOptionPane;

public class Practical4 {

    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("Please enter your name");
       JOptionPane.showMessageDialog(null,"Hi "+name);
       int age = Integer.parseInt(JOptionPane.showInputDialog("How old are"));
      JOptionPane.showMessageDialog(null,"Hi Khorommbi you are " + age);
      
    }
   
}
