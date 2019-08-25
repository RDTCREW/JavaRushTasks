package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String fileName = reader.readLine();
            reader.close();
            InputStream inStream = new FileInputStream(fileName);
            while (inStream.available()>0) {
                int data = inStream.read();
                System.out.print((char) data);
            }
            inStream.close();
        }
        catch (IOException e){
            //e.printStackTrace();
        }

    }
}