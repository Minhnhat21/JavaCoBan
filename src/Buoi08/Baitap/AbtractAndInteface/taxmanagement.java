/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi08.Baitap.AbtractAndInteface;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author nguye
 */
public class taxmanagement {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        
        Student sv = new Student("Minh Nhat", "20t1080043", "0935142594", "minhnhat@gmail.com", df.parse("2002-21-01"), true, "A");
        System.out.println(sv.payTax(0, 0, 0));
    }
}
