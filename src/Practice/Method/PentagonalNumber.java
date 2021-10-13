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
public class PentagonalNumber {
    public static void main(String[] args) {
        System.out.println(getPentagonalNumber(2));
    }
    public static int getPentagonalNumber(int n) {
        return (n > 0) ? (n * (3 * n - 1)) / 2 : 0;
    }
}
