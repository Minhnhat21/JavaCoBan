/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap;

/**
 *
 * @author nguye
 */
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String USERNAME = "HuyHoang";
        final String PASSWORD = "2021";
    
        System.out.print("Enter your usename: ");
        String usename = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();
        
        if(usename.equals(USERNAME) && password.equals(PASSWORD)) {
           System.out.println("You entered correctly ! Login in progress.......");
        } else {
            System.out.println("your password or username is not valid.");
        }
    }
    
    
    
}
