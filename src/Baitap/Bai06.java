/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai06 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập hệ số c: ");
        int c = sc.nextInt();
        
        if (a != 0) {
            int delta = b*b - 4*a*c;
            if (delta > 0) {
                // gọi x1, x2 là nghiệm của phương trình
                double x1;
                double x2;
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                x1 = (double) (-b + Math.sqrt(delta)) / (2.0*a); 
                x2 = (double) (-b - Math.sqrt(delta)) / (2.0*a);
                System.out.println("x1 = " + x1 +"\n" + "x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm duy nhất");
                double x = - b / (2*a);
                System.out.println("x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            if (b == 0) {
                System.out.println("Phương tình vô nghiệm");
            } else {
                double x = (double) -c/b;
                System.out.println("Nghiệm của phương trình là: " + x);
            }
        }
        
                
    }
}
