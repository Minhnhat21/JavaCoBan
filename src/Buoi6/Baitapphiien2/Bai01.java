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
public class Bai01 {
    public static void main(String[] args) {
        int start = 10;
        int end = 200;
        System.out.print("Prime number are: ");
        for(int i = start; i < end; i++) {
            if(i % 7 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
