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
public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numer: ");
        int number = sc.nextInt();
        int count = 0;
        System.out.println("Reverse a given integer number: ");
        while (number != 0) {
            int temp = number % 10;
            number = number /10;
            count++;
            System.out.print(temp);
        }
        System.out.println();
    }
}
