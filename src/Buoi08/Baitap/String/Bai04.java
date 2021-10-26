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
public class Bai04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String[] wold = str.split("\\s");
        
        for (String string : wold) {
            System.out.println(string);
        }
        
    }
}
