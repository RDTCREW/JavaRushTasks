package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        final String CONST_WORLD = "world";
        //final String CONST_SEPARATOR = " ";
        //final String CONST_SEPARATOR = "\\s";


        BufferedReader consoleBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleBufferedReader.readLine();
        consoleBufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int count = 0;
        String line;
        //String worlds[];

        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher;

        while (bufferedReader.ready()){
            line = bufferedReader.readLine();
            //System.out.println(line);

            matcher = pattern.matcher(line);
            while(matcher.find()){
                count++;
            }

            /*
            if (line.length() > 0) {
                worlds = line.split(CONST_SEPARATOR);
                for (String world : worlds) {
                    System.out.println("world = " + world);
                    if (CONST_WORLD.equals(world)) {
                        count++;
                        System.out.println("count = " + count);
                    }
                }
            }
            */
        }

        bufferedReader.close();
        fileReader.close();

        System.out.println(count);

    }
}
