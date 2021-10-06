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
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        int first = 0;
        int last = s.length() - 1;
        boolean isPalindrome = true;
        while(first < last) {
            if(s.charAt(first) != s.charAt(last)) {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }
        System.out.println((isPalindrome) ? s + " is a palindrome" : s + " is not a palindrome");
    }
}
