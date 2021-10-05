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
public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) Math.floor(Math.random()*(100-0+1)+0); // 0 - 100
        boolean checkNumber = true;
        int guessNumber;
        System.out.print("Enter your number: ");
        while(checkNumber) { 
            guessNumber = sc.nextInt();
            if(guessNumber == randomNumber) {
               checkNumber = false; 
               System.out.println("Your number matches the randomly generated number");
            } else {
                if (guessNumber > randomNumber){
                    int maxNumber = guessNumber;
                    System.out.print("Your number is too hight, your number must be < " +maxNumber+ "\nEnter again: ");
                    checkNumber = true;
                }
                if (guessNumber < randomNumber) {
                    int minNumber = guessNumber;
                    checkNumber = true;
                    System.out.print("Your number is too low, your number must be > " +minNumber+ "\nEnter again: ");
                }
            }
        }
    }
}
