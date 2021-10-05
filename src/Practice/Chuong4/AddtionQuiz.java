package Practice.Chuong4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class AddtionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter number1 and number2: ");
	int number1 = (int) Math.floor(Math.random()*(1000-0+1)+0);
	int number2 = (int) Math.floor(Math.random()*(1000-0+1)+0);
	int answer = 0;
	boolean checkanswer = true;
	while(checkanswer) {
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
		checkanswer = false;
		System.out.print("The answer is corect" );				
            } else {
		System.out.print("The answer is incorect" );
		checkanswer = true;
            }    
            System.out.println();
	}
				
    }
}
