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
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = sc.nextDouble();

        double BMI = Math.round((weight / (height * 2)) * 10.0) / 10.0;

        System.out.println("Body Mass Index is: " + BMI);

        if (BMI < 18.5) {
            System.out.println("UnderWeight");
        } else if (BMI >= 18.5 && BMI <= 25.0) {
            System.out.println("Normal");
        } else if (BMI >= 25.0 && BMI <= 30.0) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
    }
}
