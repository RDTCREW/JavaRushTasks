package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        Scanner scan = new Scanner(System.in);
        String fileNameIn = scan.nextLine();
        String fileNameOut = scan.nextLine();
        scan.close();
        */

        InputStreamReader consoleInputStreamReader = new InputStreamReader(System.in);
        BufferedReader consoleBufferedReader = new BufferedReader(consoleInputStreamReader);

        String inFileName = consoleBufferedReader.readLine();
        FileReader inFileReader = new FileReader(inFileName);

        String outFileName = consoleBufferedReader.readLine();
        FileWriter outFileWriter = new FileWriter(outFileName);

        consoleBufferedReader.close();
        consoleInputStreamReader.close();


        int data;

        /*
        while (inBufferedReader.ready())
        {
            data = inBufferedReader.read(); //1
            if (inBufferedReader.ready()) {
                data = inBufferedReader.read(); //2
                outBufferedWriter.write(data);
            }
        }

        inBufferedReader.close();
        inFileReader.close();

        outBufferedWriter.close();
        outFileWriter.close();
        */

        while (inFileReader.ready())
        {
            data = inFileReader.read(); //1
            if (inFileReader.ready()) {
                data = inFileReader.read(); //2
                outFileWriter.write(data);
            }
        }
        inFileReader.close();
        outFileWriter.close();
    }
}
