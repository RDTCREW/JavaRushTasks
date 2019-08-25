package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //final String CONST_SEPARATOR = " ";
        final String CONST_SEPARATOR = "\\s";


        InputStreamReader consoleInputStreamReader = new InputStreamReader(System.in);
        BufferedReader consoleBufferedReader = new BufferedReader(consoleInputStreamReader);

        String inFileName = consoleBufferedReader.readLine();
        String outFileName = consoleBufferedReader.readLine();

        consoleBufferedReader.close();
        consoleInputStreamReader.close();

        BufferedReader inBufferedReader = new BufferedReader(new FileReader(inFileName));
        BufferedWriter outBufferedWriter = new BufferedWriter(new FileWriter(outFileName));


        String line;
        String worlds[];

        while (inBufferedReader.ready()){

            line = inBufferedReader.readLine();

            if (line.length() > 0) {
                worlds = line.split(CONST_SEPARATOR);
                for (String world : worlds) {
                    try {
                        outBufferedWriter.write("" + Integer.parseInt(world) + " ");
                    } catch (Exception e) {

                    }

                }
            }

        }


        inBufferedReader.close();
        outBufferedWriter.close();


    }
}
