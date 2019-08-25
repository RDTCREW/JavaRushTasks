package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        InputStreamReader consoleInputStreamReader = new InputStreamReader(System.in);
        BufferedReader consoleBufferedReader = new BufferedReader(consoleInputStreamReader);

        String inFileName = consoleBufferedReader.readLine();
        String outFileName = consoleBufferedReader.readLine();

        consoleBufferedReader.close();
        consoleInputStreamReader.close();

        BufferedReader inBufferedReader = new BufferedReader(new FileReader(inFileName));
        BufferedWriter outBufferedWriter = new BufferedWriter(new FileWriter(outFileName));
        //BufferedReader inBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName), "Cp1251"));//"Cp1251" "UTF-8"
        //BufferedWriter outBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFileName), "Cp1251"));//"Cp1251" "UTF-8"


        String line;
        while (inBufferedReader.ready()){
            line = inBufferedReader.readLine();
            //line = line.replaceAll(".,:;!?\n","");
            //line = line.replaceAll("[\\p{Punct}\\p{Space}]", "");
            line = line.replaceAll("\\p{Punct}|\\n", "");
            outBufferedWriter.write(line);
        }

        inBufferedReader.close();
        outBufferedWriter.close();

    }
}
