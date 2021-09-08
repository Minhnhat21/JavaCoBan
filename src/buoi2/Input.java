/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Input {
    final static double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius value: ");
        double radius = sc.nextDouble();
        double area;
        area = radius * radius * PI ;
        
        System.out.println("The area for the circle of radius "+ radius + " is " + area);
    }
}
