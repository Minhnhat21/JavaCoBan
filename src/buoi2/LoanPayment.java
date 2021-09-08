/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class LoanPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter loanAmount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter monthlyInterestRate: ");
        double monthlyInterestRate = sc.nextDouble();
        System.out.print("Enter numberOfYear: ");
        int numberOfYear = sc.nextInt();
        
        double monthlyPayment;
        monthlyPayment = (loanAmount * monthlyInterestRate) 
                            / (1 - (1/(Math.pow( 1+monthlyInterestRate, numberOfYear * 12))));
        System.out.println("Monthly payment: " + monthlyPayment);
    }
 
}
