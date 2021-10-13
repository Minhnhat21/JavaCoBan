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
public class Bai01 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] Arr = InputArray();
        System.out.println(AVG(Arr));
        
    }
    
    public static int[] InputArray() {
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static double AVG(int[] arr) {     
        int n = arr.length;
        int sum = 0;
       
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum/n;
    }
}
