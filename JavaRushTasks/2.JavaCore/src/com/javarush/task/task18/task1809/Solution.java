package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();

        //C:\Users\vladimir\Desktop\asterisk.txt

        try {
            FileInputStream inputStream1 = new FileInputStream(fileName1);

            FileOutputStream outputStream2 = new FileOutputStream(fileName2);

            int available = inputStream1.available();
            byte[] buffer = new byte[available];
            inputStream1.read(buffer);

            for (int i = available-1; i >= 0; i--){
                outputStream2.write(buffer[i]);

            }

            inputStream1.close();
            outputStream2.close();

        } catch (Exception e) {
            return;
        }

    }
}
