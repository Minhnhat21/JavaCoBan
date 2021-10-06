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
public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        int number = 2;
        System.out.println("The first" + n + " prime numbers are \n");
        while (count < n) {
 
            boolean isPrime = true; 

             // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                isPrime = false; // Set isPrime to false
                break; 
                }
            }

            if (isPrime) {
                count++; // Increase the count
                System.out.print(number + " ");
            }

            number++;
        }
    }
}
