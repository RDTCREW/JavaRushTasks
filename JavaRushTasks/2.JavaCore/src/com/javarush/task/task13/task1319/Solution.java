package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try{
            String fileName = reader.readLine();
            //OutputStream outStream = new FileOutputStream(fileName);

            File file = new File(fileName);
            FileWriter fileReader = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);

            String str;
            char[] data;
            while (true) {
                str = reader.readLine();
                bufferedWriter.write(str + "\n");
                /*
                data = str.toCharArray();
                for (int i = 0; i<data.length; i++){
                    outStream.write(data[i]);
                }
                */
                if ("exit".equals(str)){
                    break;
                }
            }

            reader.close();
            //outStream.close();
            bufferedWriter.close();
        }
        catch (IOException e){
            //e.printStackTrace();
        }
    }
}
