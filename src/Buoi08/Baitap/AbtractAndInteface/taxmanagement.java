/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi08.Baitap.AbtractAndInteface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author nguye
 */
public class taxmanagement {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        
        Student sv = new Student("Minh Nhat", "20t1080043", "0935142594", "minhnhat@gmail.com", df.parse("2002-21-01"), true, "A");
        System.out.println(sv.payTax(0, 0, 0));
        
        Worker cn = new Worker("Minh Quang", "191921586", "0935142594", "minhquang@gmail.com", 14000000, 2000000, df.parse("2002-22-01"), true, "B");
        System.out.println(cn.payTax(cn.sumofincome(), 20, 30));
        
        BusinessPerson bp = new BusinessPerson("Nguyen Huu Minh Nhat", "191921586", "0935142594", "minhquang@gmail.com", 30000000, 10000000, 1000000,df.parse("2002-22-01"), true, "O");
        System.out.println(cn.payTax(bp.sumofincome(), 20, 30));
    }
}
