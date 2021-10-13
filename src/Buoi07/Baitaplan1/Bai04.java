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
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        result(num1, num2);
    }
    
    public static void result(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vố số nghiệm");
        } else if (a == 0 && b != 0){
            System.out.println("Phương trình vố nghiệm");
        } else {
            System.out.println("Nghiệm cảu phương trình là: " + (double)-b/a);
        }
    }
}
