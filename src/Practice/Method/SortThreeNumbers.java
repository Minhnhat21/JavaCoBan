/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.Method;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) {temp = num1; num1 = num2; num2 = temp;}
        if (num1 > num3) {temp = num1; num1 = num3; num3 = temp;}
        if (num2 > num3) {temp = num2; num2 = num3; num3 = temp;}
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
