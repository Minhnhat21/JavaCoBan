/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi07.Mang1Chieu.SortAndSearch;

/**
 *
 * @author nguye
 */
import java.util.Random;
import java.util.Scanner;
public class Bai01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	int n;
	int soCanTim;
	System.out.println("Nhap so phan tu cua mang");
	n = input.nextInt();
	int[] arr;
		
	arr = InputArray(n);
	System.out.println("Nhap so can tim`: ");
	soCanTim = input.nextInt();
	Search(arr,n,soCanTim);
    }
    public static int[] InputArray(int n) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[n];
		Random rand = new Random();
        int ranNum;
		System.out.println("Sinh so cho mang:");
		for(int i = 0; i < n; i++) {
			ranNum = rand.nextInt(100)+1;
			System.out.print(ranNum + " ");
			arr[i] = ranNum;
		}
		System.out.println();
		
		return arr;
	}
	
	public static void Search(int[] arr, int n, int soCanTim) {
		boolean daTimDc = false;
		for(int i = 0; i < n; i++) {
			if(arr[i] == soCanTim) {
				System.out.println("Vi tri xuat hien la`: " + i);
				daTimDc = true;
				break;
			}
		}
		if(!daTimDc)
			System.out.println(-1);
		
	}
}
