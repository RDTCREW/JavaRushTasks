package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();
        String fileName3 = scan.nextLine();


        try {
            FileInputStream inputStream1 = new FileInputStream(fileName1);

            FileOutputStream outputStream2 = new FileOutputStream(fileName2);

            FileOutputStream outputStream3 = new FileOutputStream(fileName3);

            int available = inputStream1.available();

            if (available > 0) {
                int count3 = available/2;
                int count2 = available-count3;


                byte[] buffer2 = new byte[count2];
                inputStream1.read(buffer2);
                outputStream2.write(buffer2);


                byte[] buffer3 = new byte[count3];
                inputStream1.read(buffer3,0,count3);
                outputStream3.write(buffer3);
            }

            inputStream1.close();
            outputStream2.close();
            outputStream3.close();

        } catch (Exception e) {
            return;
        }

    }
}
