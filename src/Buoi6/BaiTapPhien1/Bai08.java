/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BaiTapPhien1;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numer: ");
        int number = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= number; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
