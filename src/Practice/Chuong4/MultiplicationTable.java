package Practice.Chuong4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiplication table you want: ");
        int num = sc.nextInt();
        System.out.println("-----------------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("|  " + i + " x " + num + " = " + num*i + "  |");
        } 
        System.out.println("-----------------------");
    }
}
