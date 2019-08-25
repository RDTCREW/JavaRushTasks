package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();


        //Возвращаем все как было
        System.setOut(consoleStream);


        //Преобразовываем записанные в наш ByteArray данные в строку
        String data[] = outputStream.toString().split(" ");

        int num1 = Integer.parseInt(data[0]);
        String znak = data[1];
        int num2 = Integer.parseInt(data[2]);
        int resultNum = 0;

        if ("+".equals(znak)){
            resultNum = num1 + num2;
        } else if ("-".equals(znak)){
            resultNum = num1 - num2;
        } else if ("*".equals(znak)){
            resultNum = num1 * num2;
        };


        System.out.println("" + num1 + " " + znak + " " + num2 + " = " + resultNum);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

