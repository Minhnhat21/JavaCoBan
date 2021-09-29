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
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextFloat();
        if (Math.abs(num) >=1 && Math.abs(num) < 1000000) {
            if (num < 0) {
                System.out.println("negative number");
            } else {
                System.out.println("positive number");
            }
        } else if (Math.abs(num) <= 1 && Math.abs(num ) > 0) {
            if (num < 0) {
                System.out.println("small negative number");
            } else {
                System.out.println("small positive number");
            }
        } else if (Math.abs(num) >= 1000000) {
            if (num < 0) {
                System.out.println("large negative number");
            } else {
                System.out.println("large positive number");
            }
        } else {
            System.out.println("zero");
        }
    }
}
