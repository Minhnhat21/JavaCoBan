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
public class ComputingTaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIMGLE = 1;
        final int MARRIEDFILINGJOINTLY = 2;
        final int MARRIEDFILINGSEPARATELY = 3;
        final int HEADOFHOLDHOUSE = 4;
        double tax = 0.0;
        System.out.print("Enter status: ");
        int status = sc.nextInt();
        if (status == SIMGLE) {
            System.out.print("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 8.350) {
                tax = income * 10/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 8.351 && income <= 33.950) {
                tax = income * 15/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 33.951 && income <= 82.250) {
                tax = income * 25/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 82.251 && income <= 171.550) {
                tax = income * 28/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 171.551 && income <= 372.950) {
                tax = income * 33/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else {
                tax = income * 35/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            }    
        } else if (status == MARRIEDFILINGJOINTLY) {
            System.out.print("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 16.700) {
                tax = income * 10/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 16.701 && income <= 67.900) {
                tax = income * 15/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 67.901 && income <= 137.050) {
                tax = income * 25/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 137.051 && income <= 208.850) {
                tax = income * 28/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 208.851 && income <= 372.950) {
                tax = income * 33/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else {
                tax = income * 35/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            }
        } else if (status == MARRIEDFILINGSEPARATELY) {
            System.out.print("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 8.350) {
                tax = income * 10/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 8.351 && income <= 33.950) {
                tax = income * 15/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 33.951 && income <= 68.525) {
                tax = income * 25/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 68.526 && income <= 104.425) {
                tax = income * 28/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 104.426 && income <= 186.475) {
                tax = income * 33/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else {
                tax = income * 35/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            }
        } else if (status == HEADOFHOLDHOUSE) {
            System.out.print("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 11.950) {
                tax = income * 10/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 11.951 && income <= 45.500) {
                tax = income * 15/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 45.501 && income <= 117.450) {
                tax = income * 25/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 117.451 && income <= 190.200) {
                tax = income * 28/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else if (income >= 190.201 && income <= 372.950) {
                tax = income * 33/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            } else {
                tax = income * 35/100;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            }
        }
    }
}
