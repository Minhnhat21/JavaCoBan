/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi08.Baitap.String;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();      
        String word = sc.next();
        int count = 0;
        
        String[] string = str.split("\\s");
        System.out.print("Cac vi tri xuat hien: ");
        for (int i = 0; i < string.length; i++) {
            if (word.equals(string[i])) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nSo lan xuat hien: " + count);
    }
}
