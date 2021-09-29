/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap.BaitapPhien2;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(((year % 4 == 0 && year %100 !0) || year % 400 ==0) ? (year + " Leap year") : (year + " is not Leap year");
    }
}
