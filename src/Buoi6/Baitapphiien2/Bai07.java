/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.Baitapphiien2;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            num = num /10;
            sum += temp;
        }
        System.out.println("The total number of digits in a number: " + sum);
    }
}
