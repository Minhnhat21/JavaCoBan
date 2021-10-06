/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.Baitapphiien2;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime numbers 5 digits number are : ");
	int count;
        
	for(int i = 10000 ; i <= 99999 ; i++){
            count = 0;
            for(int j = 1 ; j <= i ; j++) {
		if(i % j == 0)
		count = count+1;
            }
            if(count == 2)
            System.out.println(i);
	}
    }
}
