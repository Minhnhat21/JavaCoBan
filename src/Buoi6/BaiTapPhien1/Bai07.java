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
public class Bai07 {
    public static void main(String[] args) {
        int n = 10, firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum + ", ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
