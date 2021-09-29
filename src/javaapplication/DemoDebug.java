/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class DemoDebug {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = sc.nextInt();
       if (num < 0) {
           System.out.println("negative number");
       } else if (num > 0) {
           System.out.println("positive number");
       } else {
           System.out.println("zero");
       }
    }
}
