package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        reader.close();

        if(num1 <= 0) throw new Exception();
        if(num2 <= 0) throw new Exception();

        int num3;
        if (num1<num2)
            num3 = num1;
        else
            num3 = num2;

        for (int i=num3; i>0; i--){
            if((num1 % i == 0) && (num2 % i == 0)){
                System.out.println(i);
                break;
            }
        }



    }
}
