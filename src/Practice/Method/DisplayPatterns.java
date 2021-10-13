/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.Method;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class DisplayPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        displayPatterns(num);
    }
    
    public static void displayPatterns(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= n ; j++){
                if( j <= n - i) {
                    System.out.print(" " + " "); 
                } else {
                    System.out.print(n - j + 1 + " ");
                }
            }
            System.out.println();

        }
    }
    
}
