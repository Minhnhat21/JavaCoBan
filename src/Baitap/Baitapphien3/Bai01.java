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
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double F_temparate = sc.nextDouble();
        double C_temparate = (F_temparate -32) * 0.5556;
        System.out.println(Math.round(F_temparate*10)/10.0 + " degree Fahrenheit is equal to " + Math.round(C_temparate*10)/10.0
                + " in Celsius");
    }
 
}
