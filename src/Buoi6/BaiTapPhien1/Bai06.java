/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi6.BaiTapPhien1;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Bai06 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Starting Number : ");
	int start = sc.nextInt();
	System.out.print("Enter Ending Number : ");
	int end = sc.nextInt();
	System.out.println("Prime numbers between "+start+" and "+end+" are : ");
	int count;
        
	for(int i = start ; i <= end ; i++){
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
