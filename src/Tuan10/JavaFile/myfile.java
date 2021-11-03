/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan10.JavaFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author nguye
 */
public class myfile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File myFile = new File("MinhNhat.txt");
        FileWriter writer = new FileWriter(myFile, true);;
        if (!myFile.exists()) {
            System.out.println("File created: " + myFile.getName());
            
        } else {
            System.out.println("File already exists.");
        }
        
            System.out.print("Nhập một chuỗi: ");
            
            String str = sc.nextLine();

            writer.write(str);
            writer.close();
            System.out.println("Thành công nhập chuỗi vào file");

            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        
        
    }
}
