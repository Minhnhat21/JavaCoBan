/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi07.Baitaplan1;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai02 {
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
