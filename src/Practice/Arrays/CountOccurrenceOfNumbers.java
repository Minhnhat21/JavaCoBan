/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice.Arrays;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
import java.util.Arrays;
public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
	int[] counts = new int[100]; // Counts the occurrences of numbers

	// Prompt the user to enter integers between 1 and 100
	System.out.print("Enter the integers between 1 and 100: ");

	// Count occurrence of numbers
	count(counts);

	// Display results
	for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((i + 1) + " occurs " + counts[i] +
					" time" + (counts[i] > 1 ? "s" : ""));
	}
    }

	/** Method count reads integers between 1 and 100 
	*   and counts the occurrences of each */
    public static void count(int[] counts){
	Scanner input = new Scanner(System.in);
	int num; // holds user input
	do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)	
            counts[num - 1]++;
	} while (num != 0);
    }
}
