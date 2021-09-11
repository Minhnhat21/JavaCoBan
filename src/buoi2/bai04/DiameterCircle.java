/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai04;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class DiameterCircle {
    final static double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Radius;
        double Diameter;
      
        System.out.print("Enter Radius: ");
        Radius = sc.nextDouble();
        
        Diameter = 2 * Radius * PI;
        
        System.out.print("The circumference of the circle is: " + Math.round(Diameter*100.0)/100.0);
        System.out.println();
    }
}
