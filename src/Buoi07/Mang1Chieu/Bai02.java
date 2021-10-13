/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi07.Mang1Chieu;

/**
 *
 * @author nguye
 */

import java.util.Scanner;
import java.util.Random;
public class Bai02 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] Arr = randomArray();
        System.out.println("Avarage of array: " + AVG(Arr));
        
    }
    
    public static int[] randomArray() {
        Random random = new Random();
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100-1) + 1;
        }
        return arr;
    }
    
    public static double AVG(int[] arr) {     
        int n = arr.length;
        int sum = 0;
       
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        return (double) sum/n;
    }
}
