/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.Chuong4;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd;
        while(num1 != num2) {
            if(num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        gcd = num1;
        System.out.println("Greatest common divisor is " + gcd);
    }
}
