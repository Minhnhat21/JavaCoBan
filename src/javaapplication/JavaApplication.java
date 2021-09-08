/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author nguye
 */
import java.util.*;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numofcompany = new int[size];
        int[] pecentTax = new int[size];
        int tax;
        int mostTaxt;
        int pos;
        
        for (int i = 0; i < size; i++){
           numofcompany[i] = sc.nextInt(); 
        }
        for (int i = 0; i < size; i++){
           pecentTax[i] = sc.nextInt(); 
        }
    }
}
