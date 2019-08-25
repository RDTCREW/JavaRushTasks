package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();

        FileReader fileReader = new FileReader(fileName1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String dataS[] = bufferedReader.readLine().split("\\s");
        bufferedReader.close();
        fileReader.close();

        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream2);

        String dataStr;
        double dataD;
        int dataI;

        for (int i = 0; i < dataS.length; i++){

            dataStr = dataS[i];
            try {
                dataD = Double.parseDouble(dataStr);
                dataI = (int)Math.round(dataD);
            } catch (Exception e1){
                try {
                    dataI = Integer.parseInt(dataStr);
                } catch (Exception e2){
                    dataI = 0;
                }
            }

            dataStr = Integer.toString(dataI);

            dataOutputStream.writeBytes(dataStr + " ");
        }

        fileReader.close();
        bufferedReader.close();

        fileOutputStream2.close();
        dataOutputStream.close();

    }
}
