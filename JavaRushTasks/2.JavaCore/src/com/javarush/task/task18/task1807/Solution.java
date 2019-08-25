package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int compareSymbol = 44;//Byte.parseByte(",");
        int data;
        int count = 0;

        try {
            while (inputStream.available() > 0){
                data = inputStream.read();
                if (data == compareSymbol){
                    count++;
                }
            }
        } catch (Exception e){

        }
        System.out.println(count);

        try {
            inputStream.close();
        } catch (Exception e){

        }

    }
}
