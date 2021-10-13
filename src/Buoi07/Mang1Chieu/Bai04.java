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
public class Bai04 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int[] arr =  randomIntegerArray();
       outputLefttoRight(arr);
       outputRighttoLeft(arr);
       
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
    
    public static void outputLefttoRight(int Arr[]) {
        
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void outputRighttoLeft(int Arr[]) {
        for (int i = Arr.length - 1; i >= 0; i--) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}
