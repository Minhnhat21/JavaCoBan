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
public class Bai04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int sum = a + b + c + d + e;
        System.out.println("The sum of 5 no is : " + sum);
        double avg = (double) sum / 5;
        System.out.println("The Average is : " + Math.round(avg*10) / 10.0);
        
    }     
}
