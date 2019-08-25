package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //exceptions.add(new ArithmeticException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new java.io.FileNotFoundException());
        exceptions.add(new java.lang.IndexOutOfBoundsException());
        exceptions.add(new java.lang.StringIndexOutOfBoundsException());
        exceptions.add(new java.lang.ClassCastException());
        exceptions.add(new java.lang.NegativeArraySizeException());
        exceptions.add(new java.lang.ArrayStoreException());
        exceptions.add(new java.lang.IllegalThreadStateException());


    }
}
