/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap.Baitapphien3;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai04 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        double minutesOfYear = 60 * 24 * 365;
        System.out.print("Input the number of minutes: ");

        double minute = input.nextDouble();

        long years = (long) (minute / minutesOfYear);
        int days = (int) (minute / 60 / 24) % 365;

        System.out.println((int) minute + " minutes is approximately " + years + " years and " + days + " days");
    }
}
