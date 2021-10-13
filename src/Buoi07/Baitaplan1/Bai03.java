/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi07.Baitaplan1;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai03 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = inputNumber();
        while ( n < 0) {
            System.out.print("Enter a number again: ");
            n = inputNumber();
        }
        System.out.print("Enter a string: ");
        String str = inputMessage();
        outputMessage(n,str);
    }
    
    public static int inputNumber() { 
        int number = sc.nextInt();
        return number;
    }
    
    public static String inputMessage() {
        String mess = sc.next();
        return mess;
    }
    
    public static void outputMessage(int n, String str) {
       for (int i = 0; i < n; i++) {
           System.out.print(str + " ");
       } 
    }
}
