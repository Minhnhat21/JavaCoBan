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
public class Baii02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("\nEnter second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("\nEnter third number: ");
        int thirdNumber = sc.nextInt();
        int max = firstNumber;
        if (max <= secondNumber) {
            max = secondNumber;
        }
        if (max <= thirdNumber) {
            max = thirdNumber;
        }
        
        System.out.println("The greatest number is: " + max);
    }
}
