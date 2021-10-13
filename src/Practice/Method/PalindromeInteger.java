/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.Method;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println((isPalindrome(number)) ? number + "is palindrome integer" : 
                            number + " not is palindrome integer");
    }
    // Return the reversal of an integer
    public static int reverse(int number) {
        int temp = 0;
        String s_number = "";
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            s_number = s_number + Integer.toString(temp);
        }
        return Integer.parseInt(s_number);
    }
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        int reverseNumber = reverse(number);
        return (reverseNumber == number) ? true : false;
    }
}
