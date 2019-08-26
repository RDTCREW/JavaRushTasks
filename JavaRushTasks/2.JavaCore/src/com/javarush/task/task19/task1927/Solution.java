package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);


        String result = outputStream.toString();
        String data[] = result.split("\\n");

        String reclama = "JavaRush - курсы Java онлайн";
        String line;

        if (data.length > 0){
            System.out.println(data[0]);
            if (data.length > 1){
                System.out.println(data[1]);

                for (int i = 2; i < data.length; i+=2){
                    System.out.println(reclama);
                    System.out.println(data[i]);
                    if (i+1 < data.length){
                        System.out.println(data[i+1]);
                    }
                }
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
