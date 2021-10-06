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
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int decimal = sc.nextInt();
        
        String hex = "";
        
        while(decimal != 0) {
            int hexValue = decimal % 16;
            char hexDigit;
            char ch = 'A';
            if (0 <= hexValue && hexValue <= 9) {
               hexDigit = (char)(hexValue + '0' ) ;
            } else {
               int temp = hexValue - 10;
               hexDigit = (char)(temp + ch);
            }
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + hex);
    }
}
