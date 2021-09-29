/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai05;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        float timeOfSeconds;
	float mps,kph, mph;

	System.out.print("Enter distance in meters: ");
	float distance = sc.nextFloat();

	System.out.print("Enter a hour: ");
	float hr = sc.nextFloat();

	System.out.print("Enter a minutes: ");
	float min = sc.nextFloat();

	System.out.print("Enter a seconds: ");
	float sec = sc.nextFloat();

	timeOfSeconds = (hr*3600) + (min*60) + sec;
	mps = distance / timeOfSeconds;
	kph = ( distance/1000.0f ) / ( timeOfSeconds/3600.0f );
	mph = kph / 1.609f;

	System.out.println("Your speed in meters/second is " + mps);
	System.out.println("Your speed in km/h is " + kph);
	System.out.println("Your speed in miles/h is "+ mph);

    }
}
