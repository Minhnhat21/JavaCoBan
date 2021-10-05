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
public class MathAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of question: ");
        int NumberOfQquestions = sc.nextInt();
        int answer = 0;
        int correctAnswer = 0;
        int incorrectAnsưer = 0;
        while(NumberOfQquestions > 0) {
            int number1 = (int) Math.floor(Math.random()*(1000-0+1)+0);
            int number2 = (int) Math.floor(Math.random()*(1000-0+1)+0);
            if (number1 >= number2) {
                System.out.println("What is " + number1 + " – " + number2 + "?");
                System.out.print("Type your answer: " );
                answer = sc.nextInt();
            } else if (number1 < number2 ) {
		System.out.println("What is " + number2 + " – " + number1 + " ?");
                System.out.print("Type your answer: " );
                answer = sc.nextInt();
            }			
            if (answer == Math.abs(number1 -number2)) {
		correctAnswer++;	
            } else {
                incorrectAnsưer++;
            }    
            System.out.println();
            NumberOfQquestions--;
        }
        System.out.println("Your number of Correct answer is " + correctAnswer);
        System.out.println("Your number of Incorrect answer is " + incorrectAnsưer);

    }
}
