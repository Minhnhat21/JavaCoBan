/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap.Baitapphien3;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inches = sc.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(Math.round(inches*10)/10.0 + " inch is " + Math.round(meters*10)/10.0 + " meters");
    }
}
