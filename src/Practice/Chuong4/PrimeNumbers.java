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
public class PrimeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime numbers are \n");
        while (count < NUMBER_OF_PRIMES) {
 
            boolean isPrime = true; 

             // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                isPrime = false; // Set isPrime to false
                break; 
                }
            }

             // Display the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
                System.out.print(number + " ");
            }

            // Check if the next number is prime
            number++;
        }
        
    }
}
