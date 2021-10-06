/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.Chuong4;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class FutureTuition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tuition = 10000;
        double doubledTuition = 10000*2.0;
        int year = 0;
        while(tuition < doubledTuition) {
            double add = tuition * (7.0/100);
            tuition = tuition + add;
            year++;
        }
        System.out.println("Number of year : " + year);
    }
}
