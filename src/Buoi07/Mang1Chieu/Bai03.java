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
public class Bai03 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] Arr = randomIntegerArray();
        double[] D_Arr = randomFloatArray(Arr.length);
        System.out.println("Weighted average of Arrays is: " + WeightedAverage(Arr));
    }
    public static int[] randomIntegerArray() {
        Random random = new Random();
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100-1) + 1;
        }
        return arr;
    }
    
    public static double[] randomFloatArray(int size) {
        Random random = new Random();

  
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }
    public static double WeightedAverage(int Arr[]) {
        double numerstor = 0.0;
        double denominator = 0.0;
        double weightedAVG;
        
        for (int i = 0; i < Arr.length; i++) {
            numerstor += Arr[i] * i; 
        }
        for (int i = 0; i < Arr.length; i++) {
            denominator += Arr[i]; 
        }
        weightedAVG = numerstor / denominator;
        return Math.round(weightedAVG * 100.0) / 100.0 ;
    }

}
