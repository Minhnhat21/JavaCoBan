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
public class Bai06 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Action();
    }
    
    public static void Action() {
        
        System.out.println("\t--------------------");
        System.out.println("1.Lựa chọn 1 để giải phương trình bậc 1");
        System.out.println("2.Lựa chọn 2 để giải phương trình bậc 2");
        System.out.println("3.Lựa chọn 3 để thoát");

        System.out.println("\t--------------------");
        
        System.out.print("Nhập sự lựa chọn: ");
        int luachon = sc.nextInt();
        switch(luachon) {
            case 1: 
                giaiPTBac1();
                break;
            case 2:
                giaiPTBac2();
                break;
            case 3:
                System.out.println("Chương trình đang thoát....");
                break;
            default:
                break;
        }

    }
    
    public static void giaiPTBac1() {
        System.out.print("Enter 2 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vố số nghiệm");
        } else if (a == 0 && b != 0){
            System.out.println("Phương trình vố nghiệm");
        } else {
            System.out.println("Nghiệm cảu phương trình là: " + (double)-b/a);
        }
    }
    
    public static void giaiPTBac2() {
        System.out.print("Enter 3 number: ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
  
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
       
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
