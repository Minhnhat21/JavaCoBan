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
public class Bai05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = sc.nextInt();
        // gọi x là nghiệm cảu phương trình
        if (a != 0) {
            double x = (double) -b/a;
            System.out.println("Nghiệm của phương trình bậc nhất 1 ẩn là: " + x);

        } else {
            System.out.println("Không thể tính toán");
        }
        
        
    }
 
}
