/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi03;
/**
 *
 * @author nguye
 */
import java.util.Scanner;

public class DEMOIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numInteger = sc.nextInt();
	if (numInteger % 5 == 0) {
            System.out.println("HiFive");
	} 
	if (numInteger % 2 == 0) {
            System.out.println("HiEven");
	}
    }
   
}
