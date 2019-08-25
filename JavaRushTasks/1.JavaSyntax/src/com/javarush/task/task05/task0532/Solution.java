package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int namber;
        int maximum = -2147483648;
        for ( ; n > 0 ; n--){
            namber = Integer.parseInt(reader.readLine());
            if (namber > maximum) {
                maximum = namber;
            }
        }

        System.out.println(maximum);
    }
}
