/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai02;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        outputStr(str);
    }
    
    public static void outputStr(String str) {
        System.out.println(str);
    }
}
