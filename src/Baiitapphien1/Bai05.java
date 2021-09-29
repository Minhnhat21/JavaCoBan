/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baiitapphien1;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input floating-point number: " );
        double num1 = sc.nextDouble();
        System.out.print("Input floating-point another number: ");
        double num2 = sc.nextDouble();
        if (Math.round(num1*1000)/1000.0 == Math.round(num2*1000)/1000.0 ) {
            System.out.println("They are same");
        } else {
            System.out.println("They are different");
        }
    }
}
