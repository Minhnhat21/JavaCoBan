/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baiitapphien1;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("zero");
        }
    }
}
