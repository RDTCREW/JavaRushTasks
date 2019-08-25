package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    /*
    public static int factorial(int n) {
        if( n < 0)
            return 0;
        else if( n == 0)
            return 1;
        return n * factorial(n-1);
    }
    */

    public static String factorial(int n) {

        if( n < 0)
            return "0";
        else if( n == 0)
            return "1";

        //BigDecimal res = new BigDecimal(1);
        BigInteger res = new BigInteger("1");

        for (int i = 2; i<=n; i++){
            //res = res.multiply(new BigDecimal(i));
            res = res.multiply(new BigInteger(Integer.toString(i)));
            //System.out.println("i="+i+"; res="+res);
        }

        return res.toString();
    }
}
